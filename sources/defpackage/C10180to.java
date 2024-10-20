package defpackage;

import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: to, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10180to {
    public boolean a;
    public String b;
    public boolean c;
    public UL2 d;
    public Executor e;
    public byte f;

    public final C10523uo a() {
        if (this.d == null) {
            int i = AbstractC1472Li1.h;
            this.d = UL2.o;
        }
        if (this.f != 3 || this.b == null || this.e == null) {
            StringBuilder sb = new StringBuilder();
            if ((this.f & 1) == 0) {
                sb.append(" dumpable");
            }
            if (this.b == null) {
                sb.append(" loggerName");
            }
            if ((this.f & 2) == 0) {
                sb.append(" enableTikTokIntegration");
            }
            if (this.e == null) {
                sb.append(" listenerExecutor");
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
        }
        return new C10523uo(this.a, this.b, this.c, this.d, this.e);
    }
}
