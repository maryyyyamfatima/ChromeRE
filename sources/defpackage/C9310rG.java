package defpackage;

import J.N;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.autofill.PersonalDataManager;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9310rG extends AbstractC10229tw0 implements InterfaceC0786Gb0 {
    public int A;
    public final boolean B;
    public final WebContents c;
    public final ArrayList d;
    public final HashMap e;
    public final K7 f;
    public final HashMap g;
    public final HashSet h;
    public final HashSet i;
    public final ArrayList j;
    public final Handler k;
    public final C7250lG l;
    public final C6220iG m;
    public final C7594mG n;
    public C1281Jw0 o;
    public C1281Jw0 p;
    public C1281Jw0 q;
    public C1281Jw0 r;
    public C1281Jw0 s;
    public C1281Jw0 t;
    public C1281Jw0 u;
    public C0916Hb0 v;
    public C7938nG w;
    public boolean x;
    public boolean y;
    public int z;

    public final void d(C1634Mp c1634Mp) {
        if (!c1634Mp.a) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                if (c1634Mp.t == null) {
                    PersonalDataManager d = PersonalDataManager.d();
                    c1634Mp.t = N.My71lPBY(d.a, d, c1634Mp.q);
                }
                PersonalDataManager.AutofillProfile autofillProfile = c1634Mp.q;
                String str = c1634Mp.t;
                autofillProfile.p = str;
                c1634Mp.n[1] = str;
                arrayList.add(0, new PersonalDataManager.AutofillProfile(autofillProfile));
                return;
            }
            if (TextUtils.equals(((PersonalDataManager.AutofillProfile) arrayList.get(i)).getGUID(), c1634Mp.l)) {
                arrayList.set(i, c1634Mp.q);
                this.e.remove(c1634Mp.l);
                return;
            }
            i++;
        }
    }

    public C9310rG(WebContents webContents, K7 k7, boolean z) {
        this.c = webContents;
        this.f = k7;
        PersonalDataManager d = PersonalDataManager.d();
        d.getClass();
        Object obj = ThreadUtils.a;
        ArrayList g = d.g(N.MfY8Rzvb(d.a, d, true, false, false), N.M2$wnjuR(d.a, d));
        this.d = new ArrayList();
        this.e = new HashMap();
        for (int i = 0; i < g.size(); i++) {
            PersonalDataManager.AutofillProfile autofillProfile = (PersonalDataManager.AutofillProfile) g.get(i);
            if (autofillProfile.c && !TextUtils.isEmpty(autofillProfile.getStreetAddress())) {
                this.d.add(autofillProfile);
                Pair k = C1634Mp.k(C1634Mp.g(autofillProfile, 1));
                if (((Integer) k.first).intValue() != 0) {
                    this.e.put(autofillProfile.getGUID(), (Integer) k.first);
                }
            }
        }
        Collections.sort(this.d, new Comparator() { // from class: hG
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                PersonalDataManager.AutofillProfile autofillProfile2 = (PersonalDataManager.AutofillProfile) obj3;
                boolean z2 = C1634Mp.g((PersonalDataManager.AutofillProfile) obj2, 0) == 0;
                boolean z3 = C1634Mp.g(autofillProfile2, 0) == 0;
                if (z3 == z2) {
                    return 0;
                }
                return z3 ? 1 : -1;
            }
        });
        HashMap hashMap = new HashMap();
        this.g = hashMap;
        hashMap.put("amex", new C8968qG(R.drawable.f44590_resource_name_obfuscated_res_0x7f090099, R.string.f68010_resource_name_obfuscated_res_0x7f140219));
        hashMap.put("diners", new C8968qG(R.drawable.f46080_resource_name_obfuscated_res_0x7f090160, R.string.f68020_resource_name_obfuscated_res_0x7f14021a));
        hashMap.put("discover", new C8968qG(R.drawable.f46090_resource_name_obfuscated_res_0x7f090161, R.string.f68030_resource_name_obfuscated_res_0x7f14021b));
        hashMap.put("jcb", new C8968qG(R.drawable.f51020_resource_name_obfuscated_res_0x7f09036a, R.string.f68040_resource_name_obfuscated_res_0x7f14021c));
        hashMap.put("mastercard", new C8968qG(R.drawable.f51220_resource_name_obfuscated_res_0x7f09038e, R.string.f68050_resource_name_obfuscated_res_0x7f14021d));
        hashMap.put("mir", new C8968qG(R.drawable.f51290_resource_name_obfuscated_res_0x7f090395, R.string.f68060_resource_name_obfuscated_res_0x7f14021e));
        hashMap.put("unionpay", new C8968qG(R.drawable.f54080_resource_name_obfuscated_res_0x7f0904de, R.string.f68070_resource_name_obfuscated_res_0x7f14021f));
        hashMap.put("visa", new C8968qG(R.drawable.f54140_resource_name_obfuscated_res_0x7f0904e4, R.string.f68080_resource_name_obfuscated_res_0x7f140220));
        this.h = new HashSet();
        this.i = new HashSet();
        this.j = new ArrayList();
        this.k = new Handler();
        this.l = new C7250lG(this);
        this.m = new C6220iG(this);
        C7594mG c7594mG = new C7594mG();
        this.n = c7594mG;
        c7594mG.c(AbstractC0185Bl.e);
        this.B = z;
    }

    public static PersonalDataManager.AutofillProfile c(String str, ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (((PersonalDataManager.AutofillProfile) arrayList.get(i)).getGUID().equals(str)) {
                return (PersonalDataManager.AutofillProfile) arrayList.get(i);
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC0786Gb0
    public final void b(int i, int i2, String str) {
        if (!TextUtils.isEmpty("")) {
            this.q.s = "";
        }
        if (!TextUtils.isEmpty(str)) {
            this.p.s = str;
        }
        if (i2 >= 2000) {
            this.s.s = Integer.toString(i2);
        }
        if (i >= 1 && i <= 12) {
            String num = Integer.toString(i);
            if (num.length() == 1) {
                num = "0".concat(num);
            }
            this.r.s = num;
        }
        ViewOnClickListenerC0501Dw0 viewOnClickListenerC0501Dw0 = this.a;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = viewOnClickListenerC0501Dw0.j;
            if (i3 >= arrayList.size()) {
                this.y = false;
                return;
            } else {
                ((InterfaceC1411Kw0) arrayList.get(i3)).d();
                i3++;
            }
        }
    }

    @Override // defpackage.InterfaceC0786Gb0
    public final void a() {
        this.y = false;
    }
}
