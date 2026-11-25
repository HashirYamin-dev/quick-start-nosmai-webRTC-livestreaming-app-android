package com.nosmai.quickstart.webrtc

/**
 * The only key this demo needs is your Nosmai license key. Replace the value below.
 *
 * - Nosmai license key: from your Nosmai dashboard. It is tied to the app's
 *   application ID, so `applicationId` in app/build.gradle.kts must match the one
 *   the key was created for.
 * - Room name: any name. The host and the audience must use the same one.
 *
 * WebRTC itself needs no account: the two phones find each other on the local
 * network (see LocalSignaling.kt).
 */
object DemoConfig {
    const val NOSMAI_LICENSE_KEY = "YOUR_NOSMAI_LICENSE_KEY"
    const val ROOM_NAME = "demo-room"

    /** Returns a human readable reason when a key is still missing, or null when all are set. */
    fun problem(): String? = when {
        NOSMAI_LICENSE_KEY.isBlank() || NOSMAI_LICENSE_KEY.startsWith("YOUR_") ->
            "Set NOSMAI_LICENSE_KEY in DemoConfig.kt."
        ROOM_NAME.isBlank() -> "Set ROOM_NAME in DemoConfig.kt."
        else -> null
    }
}
