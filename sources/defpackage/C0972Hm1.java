package defpackage;

import java.io.InputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0972Hm1 implements InterfaceC8075ng0 {
    public final SI2 a;

    public C0972Hm1(InputStream inputStream, C3492aK1 c3492aK1) {
        SI2 si2 = new SI2(inputStream, c3492aK1);
        this.a = si2;
        si2.mark(5242880);
    }

    @Override // defpackage.InterfaceC8075ng0
    public final Object a() {
        SI2 si2 = this.a;
        si2.reset();
        return si2;
    }

    @Override // defpackage.InterfaceC8075ng0
    public final void b() {
        this.a.c();
    }
}
