package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10324uD implements InterfaceC1994Pj {
    @Override // defpackage.InterfaceC1994Pj
    public final int a() {
        return 1;
    }

    @Override // defpackage.InterfaceC1994Pj
    public final String getTag() {
        return "ByteArrayPool";
    }

    @Override // defpackage.InterfaceC1994Pj
    public final int b(Object obj) {
        return ((byte[]) obj).length;
    }

    @Override // defpackage.InterfaceC1994Pj
    public final Object newArray(int i) {
        return new byte[i];
    }
}
