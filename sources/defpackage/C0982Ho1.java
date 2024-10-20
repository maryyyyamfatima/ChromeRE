package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ho1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0982Ho1 implements InterfaceC1994Pj {
    @Override // defpackage.InterfaceC1994Pj
    public final int a() {
        return 4;
    }

    @Override // defpackage.InterfaceC1994Pj
    public final String getTag() {
        return "IntegerArrayPool";
    }

    @Override // defpackage.InterfaceC1994Pj
    public final int b(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // defpackage.InterfaceC1994Pj
    public final Object newArray(int i) {
        return new int[i];
    }
}
