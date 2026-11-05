package id.ikuradachi.patches.bstation.ads

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import id.ikuradachi.patches.bstation.shared.Constants.COMPATIBILITY_BSTATION

@Suppress("unused")
val underPlayerAdsPatch = bytecodePatch(
    name = "Disable under-player ads",
    description = "Disables direct and SDK advertisements below the player while preserving access prompts.",
    default = false,
) {
    category("Ads")
    compatibleWith(COMPATIBILITY_BSTATION)

    execute {
        val factories = listOf(DirectUnderPlayerAdFingerprint, SdkUnderPlayerAdFingerprint)
        factories.forEach { it.matchAll(1..1) }
        factories.forEach {
            it.method.addInstructions(0, """
                const/4 v0, 0x0
                return-object v0
            """.trimIndent())
        }
    }
}
