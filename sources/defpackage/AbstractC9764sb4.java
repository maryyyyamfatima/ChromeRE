package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sb4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9764sb4 {
    public static String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown" : "VoiceSearch" : "Search" : "Download" : "ChromeIntro" : "Summary";
    }

    public static void b(int i, int i2) {
        EI2.h(i2, 12, "VideoTutorials." + a(i) + ".Player.UserAction");
    }

    public static void c(int i, int i2) {
        EI2.h(i2, 5, "VideoTutorials." + a(i) + ".Player.Progress");
    }
}
