package defpackage;

import J.N;
import android.util.Base64;
import android.util.Pair;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Vk4 extends AbstractC0185Bl {
    public final /* synthetic */ Kn4 h;
    public final /* synthetic */ String i;
    public final /* synthetic */ String j;
    public final /* synthetic */ String k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ List n;
    public final /* synthetic */ Callback o;
    public final /* synthetic */ Wk4 p;

    public Vk4(Wk4 wk4, Kn4 kn4, String str, String str2, String str3, boolean z, boolean z2, List list, Sk4 sk4) {
        this.p = wk4;
        this.h = kn4;
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = z;
        this.m = z2;
        this.n = list;
        this.o = sk4;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        String[] strArr;
        byte[][] bArr;
        String[] strArr2;
        String[][] strArr3;
        String str;
        String str2;
        String str3;
        boolean z;
        boolean z2;
        Pair pair = (Pair) obj;
        String str4 = this.i;
        String str5 = this.j;
        String str6 = (String) pair.first;
        String str7 = this.k;
        String str8 = (String) pair.second;
        boolean z3 = this.l;
        boolean z4 = this.m;
        Callback callback = this.o;
        this.p.getClass();
        Kn4 kn4 = this.h;
        int i = kn4.e().n;
        int size = kn4.h().size();
        String[] strArr4 = new String[size];
        String[] strArr5 = new String[size];
        Iterator it = kn4.h().entrySet().iterator();
        int i2 = 0;
        while (true) {
            String str9 = "";
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            strArr4[i2] = (String) entry.getKey();
            String str10 = (String) entry.getValue();
            if (str10 != null) {
                str9 = str10;
            }
            strArr5[i2] = str9;
            i2++;
        }
        String[][] strArr6 = new String[kn4.q().size()];
        byte[][] bArr2 = new byte[kn4.q().size()];
        int i3 = 0;
        while (true) {
            strArr = strArr5;
            if (i3 >= kn4.q().size()) {
                break;
            }
            Wj4 wj4 = (Wj4) kn4.q().get(i3);
            String[] strArr7 = strArr4;
            String[] strArr8 = new String[5];
            int i4 = i;
            strArr8[0] = wj4.a;
            strArr8[1] = wj4.b;
            strArr8[2] = wj4.c;
            Callback callback2 = callback;
            strArr8[3] = wj4.d;
            strArr8[4] = wj4.e;
            strArr6[i3] = strArr8;
            Jn4 jn4 = wj4.f;
            byte[] bArr3 = jn4.a;
            bArr2[i3] = bArr3 != null ? bArr3 : Base64.decode(jn4.b(), 0);
            i3++;
            strArr5 = strArr;
            strArr4 = strArr7;
            i = i4;
            callback = callback2;
        }
        String[] strArr9 = strArr4;
        int i5 = i;
        Callback callback3 = callback;
        String[] strArr10 = new String[0];
        String[][] strArr11 = new String[0];
        Ik4 ik4 = kn4.e().k;
        if (ik4 != null) {
            String[] strArr12 = ik4.a;
            String str11 = strArr12[0];
            String str12 = strArr12[1];
            String str13 = strArr12[2];
            boolean z5 = ik4.b;
            bArr = bArr2;
            boolean z6 = ik4.c;
            strArr2 = ik4.d;
            str3 = str13;
            str = str11;
            z = z5;
            strArr3 = ik4.e;
            str2 = str12;
            z2 = z6;
        } else {
            bArr = bArr2;
            strArr2 = strArr10;
            strArr3 = strArr11;
            str = "";
            str2 = str;
            str3 = str2;
            z = false;
            z2 = false;
        }
        List list = this.n;
        int[] iArr = new int[list.size()];
        for (int i6 = 0; i6 < list.size(); i6++) {
            iArr[i6] = ((Integer) list.get(i6)).intValue();
        }
        N.MBaSXT5X(str4, kn4.e().f, kn4.o(), kn4.n(), kn4.p(), kn4.e().g, kn4.a(), str5, str6, kn4.k(), str7, str8, kn4.e().c, strArr9, strArr, kn4.d(), kn4.f().h, kn4.r(), kn4.b(), str, str2, str3, z, z2, strArr2, strArr3, strArr6, bArr, kn4.m(), kn4.t(), i5, z3, z4, iArr, callback3);
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        Kn4 kn4 = this.h;
        return Pair.create(kn4.g().b(), kn4.e().b.b());
    }
}
