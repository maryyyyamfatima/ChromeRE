package defpackage;

import java.io.File;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hB0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5852hB0 {
    public final AbstractC10187tp0 a;
    public volatile InterfaceC4691dp0 b;

    public C5852hB0(AbstractC10187tp0 abstractC10187tp0) {
        this.a = abstractC10187tp0;
    }

    public final InterfaceC4691dp0 a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    AbstractC10187tp0 abstractC10187tp0 = this.a;
                    C2026Pp1 c2026Pp1 = abstractC10187tp0.b;
                    File cacheDir = c2026Pp1.a.getCacheDir();
                    C10530up0 c10530up0 = null;
                    if (cacheDir == null) {
                        cacheDir = null;
                    } else {
                        String str = c2026Pp1.b;
                        if (str != null) {
                            cacheDir = new File(cacheDir, str);
                        }
                    }
                    if (cacheDir != null && (cacheDir.isDirectory() || cacheDir.mkdirs())) {
                        c10530up0 = new C10530up0(cacheDir, abstractC10187tp0.a);
                    }
                    this.b = c10530up0;
                }
                if (this.b == null) {
                    this.b = new C5035ep0();
                }
            }
        }
        return this.b;
    }
}
