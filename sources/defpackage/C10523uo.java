package defpackage;

import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10523uo {
    public final boolean a;
    public final String b;
    public final boolean c;
    public final AbstractC1472Li1 d;
    public final Executor e;

    static {
        a().a();
    }

    public C10523uo(boolean z, String str, boolean z2, AbstractC1472Li1 abstractC1472Li1, Executor executor) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = abstractC1472Li1;
        this.e = executor;
    }

    public static C10180to a() {
        C10180to c10180to = new C10180to();
        c10180to.c = false;
        byte b = (byte) (c10180to.f | 2);
        c10180to.a = true;
        c10180to.f = (byte) (b | 1);
        c10180to.e = EnumC6747jo0.a;
        c10180to.b = "Unknown";
        return c10180to;
    }

    public final String toString() {
        return "LoggerOptions{dumpable=" + this.a + ", loggerName=" + this.b + ", enableTikTokIntegration=" + this.c + ", appIdOverrideForProducts=" + String.valueOf(C5785h.a) + ", appFlowListeners=" + String.valueOf(this.d) + ", listenerExecutor=" + String.valueOf(this.e) + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10523uo)) {
            return false;
        }
        C10523uo c10523uo = (C10523uo) obj;
        return this.a == c10523uo.a && this.b.equals(c10523uo.b) && this.c == c10523uo.c && this.d.equals(c10523uo.d) && this.e.equals(c10523uo.e);
    }

    public final int hashCode() {
        return (((((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ 2040732332) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }
}
