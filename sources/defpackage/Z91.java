package defpackage;

import android.net.Uri;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Z91 {
    public final Uri a;
    public final byte[] b;
    public final AbstractC0562Ei1 c;

    public Z91(Uri uri, ArrayList arrayList, byte[] bArr) {
        AbstractC0562Ei1 abstractC0562Ei1;
        this.a = uri;
        this.b = bArr;
        if (arrayList != null) {
            abstractC0562Ei1 = AbstractC0562Ei1.o(arrayList);
        } else {
            C0172Bi1 c0172Bi1 = AbstractC0562Ei1.g;
            abstractC0562Ei1 = OL2.j;
        }
        this.c = abstractC0562Ei1;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        C1007Ht1 c1007Ht1 = new C1007Ht1(", ");
        ArrayList arrayList = new ArrayList();
        C0172Bi1 listIterator = this.c.listIterator(0);
        while (listIterator.hasNext()) {
            arrayList.add(((U91) listIterator.next()).toString());
        }
        return KR0.a("HttpRequest(url=", valueOf, ", httpMethod=POST, headers=[", c1007Ht1.b(AbstractC0562Ei1.o(arrayList)), "])");
    }
}
