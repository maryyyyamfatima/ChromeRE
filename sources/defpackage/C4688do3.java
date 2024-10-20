package defpackage;

import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: do3 */
/* loaded from: classes.dex */
public final class C4688do3 implements InterfaceC5455g20 {
    public final /* synthetic */ C5720go3 a;

    @Override // defpackage.InterfaceC5455g20
    public final void a(long j) {
        C5720go3 c5720go3 = this.a;
        C1758Nn3 c1758Nn3 = (C1758Nn3) c5720go3.c;
        c1758Nn3.getClass();
        if (c5720go3.i) {
            return;
        }
        c1758Nn3.U = false;
        c1758Nn3.h();
        C5720go3[] c5720go3Arr = c1758Nn3.i;
        int length = c5720go3Arr.length;
        int i = c5720go3.a;
        boolean z = length == 0 || c5720go3Arr[c5720go3Arr.length - 1].a == i;
        boolean z2 = c1758Nn3.V && c5720go3Arr.length > 1;
        C4424d20 d = C4424d20.d(((C9897sy1) c1758Nn3.a).H, c5720go3, C5720go3.D, c5720go3.q, c5720go3.v, 150L);
        c5720go3.i = true;
        Tab c = c1758Nn3.c.c(i, false);
        d.addListener(new C1239Jn3(c1758Nn3, z2, c5720go3, c, z));
        c1758Nn3.U = true;
        c1758Nn3.n = d;
        d.start();
        if (z2 || c == null) {
            return;
        }
        c1758Nn3.A(j, c.getId(), c5720go3.a, false);
    }

    public C4688do3(C5720go3 c5720go3) {
        this.a = c5720go3;
    }
}
