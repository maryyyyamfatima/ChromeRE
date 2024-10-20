package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ra0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9411ra0 implements FX {
    public static final C6492j31 c = C6492j31.j();
    public final Hr4 a;
    public final int b;

    public C9411ra0(Hr4 hr4, int i) {
        this.a = hr4;
        this.b = i;
    }

    @Override // defpackage.FX
    public final void b() {
        AbstractC6690je3.b(c.b(), "com/google/android/libraries/search/rendering/xuikit/elements/logging/CountingCommandPerformanceLogger", "startCommandExecution", 17, "CountingCommandPerformanceLogger.kt").d(this.b, "startCommandExecution(), commandExtensionNumber = %d");
    }

    @Override // defpackage.FX
    public final void a(boolean z) {
        InterfaceC6918kI1 b = AbstractC6690je3.b(c.b(), "com/google/android/libraries/search/rendering/xuikit/elements/logging/CountingCommandPerformanceLogger", "endCommandExecution", 23, "CountingCommandPerformanceLogger.kt");
        int i = this.b;
        b.i(i, z);
        this.a.a(i, z ? "Runtime.Command.Error" : "Runtime.Command.Success");
    }
}
