package id.ikuradachi.patches.bstation.ads

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import id.ikuradachi.patches.bstation.shared.Constants.COMPATIBILITY_BSTATION

@Suppress("unused")
val ratingPromptsPatch = bytecodePatch(
    name = "Disable rating prompts",
    description = "Disables unsolicited app rating dialogs.",
    default = false,
) {
    category("Ads")
    compatibleWith(COMPATIBILITY_BSTATION)

    execute {
        RatingOwnerFingerprint.matchAll(1..1)
        RatingPresenterFingerprint.matchAll(1..1)
        RatingPresenterFingerprint.method.addInstructions(0, "return-void")
    }
}
