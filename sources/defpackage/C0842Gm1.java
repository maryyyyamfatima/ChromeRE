package defpackage;

import java.io.InputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0842Gm1 implements InterfaceC7731mg0 {
    public final C3492aK1 a;

    @Override // defpackage.InterfaceC7731mg0
    public final InterfaceC8075ng0 b(Object obj) {
        return new C0972Hm1((InputStream) obj, this.a);
    }

    public C0842Gm1(C3492aK1 c3492aK1) {
        this.a = c3492aK1;
    }

    @Override // defpackage.InterfaceC7731mg0
    public final Class a() {
        return InputStream.class;
    }
}
