package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ha, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC0910Ha implements Runnable {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ InterfaceC0218Br2 g;
    public final /* synthetic */ A5 h;

    public RunnableC0910Ha(A5 a5, String[] strArr, InterfaceC0218Br2 interfaceC0218Br2) {
        this.h = a5;
        this.a = strArr;
        this.g = interfaceC0218Br2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String[] strArr = this.a;
        int[] iArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            iArr[i] = this.h.hasPermission(strArr[i]) ? 0 : -1;
        }
        this.g.b(iArr, strArr);
    }
}
