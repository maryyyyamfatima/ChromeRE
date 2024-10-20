package defpackage;

import J.N;
import android.app.ProgressDialog;
import android.os.Handler;
import com.android.chrome.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.autofill.PersonalDataManager;
import org.chromium.chrome.browser.autofill.settings.AutofillProfileBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class K7 extends AbstractC10229tw0 implements PersonalDataManager.GetSubKeysRequestDelegate {
    public final boolean h;
    public AutofillProfileBridge k;
    public C1281Jw0 l;
    public C1281Jw0 m;
    public C1281Jw0 n;
    public C1281Jw0 o;
    public ArrayList p;
    public boolean q;
    public String r;
    public Runnable s;
    public PersonalDataManager.AutofillProfile t;
    public C1930Ow0 u;
    public ProgressDialog v;
    public M7 w;
    public final Handler c = new Handler();
    public final HashMap d = new HashMap();
    public final HashSet e = new HashSet();
    public final int f = 1;
    public final boolean g = true;
    public final C2827Vt2 i = new C2827Vt2();
    public final I7 j = new I7(false);

    public K7(boolean z) {
        this.h = z;
    }

    public final String f(int i) {
        M7 m7 = this.w;
        if (m7 == null) {
            return null;
        }
        switch (i) {
            case 0:
                return m7.d;
            case 1:
                return m7.j;
            case 2:
                return m7.c;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return m7.e;
            case 4:
                return m7.k;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return m7.h;
            case 6:
                return m7.b;
            case 7:
                return m7.f;
            case 8:
                return m7.i;
            default:
                return null;
        }
    }

    public final void d(final Callback callback, final C1634Mp c1634Mp) {
        String str;
        final C1634Mp c1634Mp2;
        if (this.k == null) {
            this.k = new AutofillProfileBridge();
        }
        if (c1634Mp == null) {
            c1634Mp2 = new C1634Mp(this.b, new PersonalDataManager.AutofillProfile(), 0);
            str = this.b.getString(R.string.0_resource_name_obfuscated_res_0x7f140223);
        } else {
            str = c1634Mp.j;
            c1634Mp2 = c1634Mp;
        }
        this.u = new C1930Ow0(str, null);
        this.t = c1634Mp2.q;
        this.r = null;
        if (this.l == null) {
            this.l = C1281Jw0.a(this.b.getString(R.string.0_resource_name_obfuscated_res_0x7f14024f), AutofillProfileBridge.b(), null);
        }
        C1281Jw0 c1281Jw0 = this.l;
        c1281Jw0.u = new G7(this);
        c1281Jw0.s = C1634Mp.j(this.t);
        this.j.a = this.l.s.toString();
        this.i.g = this.l.s.toString();
        int i = this.f;
        if (i == 2) {
            C7928nE c7928nE = UN.a;
            if (N.M09VlOh_("AutofillEnableSupportForHonorificPrefixes")) {
                if (this.m == null) {
                    C1281Jw0 b = C1281Jw0.b();
                    this.m = b;
                    b.p = this.b.getString(R.string.0_resource_name_obfuscated_res_0x7f140251);
                }
                this.m.s = this.t.getHonorificPrefix();
            }
        }
        HashMap hashMap = this.d;
        if (hashMap.isEmpty()) {
            hashMap.put(2, C1281Jw0.b());
            hashMap.put(3, C1281Jw0.b());
            hashMap.put(7, C1281Jw0.b());
            hashMap.put(4, new C1281Jw0(6));
            hashMap.put(5, new C1281Jw0(6));
            hashMap.put(6, new C1281Jw0(3));
            hashMap.put(8, new C1281Jw0(4));
        }
        if (this.n == null) {
            this.n = C1281Jw0.c(1, this.b.getString(R.string.0_resource_name_obfuscated_res_0x7f140252), this.e, this.i, this.j, null, this.g ? this.b.getString(R.string.0_resource_name_obfuscated_res_0x7f140841) : null, this.b.getString(R.string.0_resource_name_obfuscated_res_0x7f140823), null);
        }
        this.n.s = this.t.getPhoneNumber();
        if (i == 2) {
            if (this.o == null) {
                this.o = C1281Jw0.c(2, this.b.getString(R.string.0_resource_name_obfuscated_res_0x7f140250), null, null, null, null, null, this.b.getString(R.string.0_resource_name_obfuscated_res_0x7f140817), null);
            }
            this.o.s = this.t.getEmailAddress();
        }
        C1930Ow0 c1930Ow0 = this.u;
        c1930Ow0.e = new Runnable() { // from class: C7
            @Override // java.lang.Runnable
            public final void run() {
                this.q = true;
                PersonalDataManager d = PersonalDataManager.d();
                d.getClass();
                Object obj = ThreadUtils.a;
                N.MCBooW5W(d.a);
                callback.onResult(c1634Mp);
            }
        };
        c1930Ow0.d = new Runnable() { // from class: E7
            @Override // java.lang.Runnable
            public final void run() {
                HashMap hashMap2;
                K7 k7 = this;
                k7.q = true;
                PersonalDataManager d = PersonalDataManager.d();
                d.getClass();
                Object obj = ThreadUtils.a;
                N.MCBooW5W(d.a);
                PersonalDataManager.AutofillProfile autofillProfile = k7.t;
                String charSequence = k7.l.s.toString();
                autofillProfile.getClass();
                autofillProfile.m = new C2042Ps2(charSequence, 4);
                autofillProfile.n = new C2042Ps2(k7.n.s.toString(), 4);
                C1281Jw0 c1281Jw02 = k7.o;
                if (c1281Jw02 != null) {
                    autofillProfile.o = new C2042Ps2(c1281Jw02.s.toString(), 4);
                }
                C1281Jw0 c1281Jw03 = k7.m;
                if (c1281Jw03 != null) {
                    autofillProfile.d = new C2042Ps2(c1281Jw03.s.toString(), 4);
                }
                autofillProfile.q = k7.k.a;
                HashSet hashSet = new HashSet();
                int i2 = 0;
                while (true) {
                    int size = k7.p.size();
                    hashMap2 = k7.d;
                    if (i2 >= size) {
                        break;
                    }
                    C6764jr c6764jr = (C6764jr) k7.p.get(i2);
                    hashSet.add(Integer.valueOf(c6764jr.a));
                    int i3 = c6764jr.a;
                    if (i3 != 0) {
                        K7.h(autofillProfile, i3, ((C1281Jw0) hashMap2.get(Integer.valueOf(i3))).s);
                    }
                    i2++;
                }
                for (Map.Entry entry : hashMap2.entrySet()) {
                    if (!hashSet.contains(entry.getKey())) {
                        K7.h(autofillProfile, ((Integer) entry.getKey()).intValue(), "");
                    }
                }
                if (k7.h) {
                    PersonalDataManager d2 = PersonalDataManager.d();
                    PersonalDataManager.AutofillProfile autofillProfile2 = k7.t;
                    d2.getClass();
                    Object obj2 = ThreadUtils.a;
                    autofillProfile.a = N.McRRW$S3(d2.a, d2, autofillProfile2);
                }
                if (autofillProfile.getGUID().isEmpty()) {
                    autofillProfile.a = UUID.randomUUID().toString();
                }
                autofillProfile.c = true;
                boolean z = k7.g;
                C1634Mp c1634Mp3 = c1634Mp2;
                if (z) {
                    c1634Mp3.o(k7.t);
                } else {
                    c1634Mp3.o(k7.t);
                }
                callback.onResult(c1634Mp3);
            }
        };
        g(this.l.s.toString());
        if (this.w != null) {
            this.a.i();
        }
    }

    public static void h(PersonalDataManager.AutofillProfile autofillProfile, int i, CharSequence charSequence) {
        switch (i) {
            case 0:
                autofillProfile.m = new C2042Ps2(e(charSequence), 4);
                return;
            case 1:
                autofillProfile.h = new C2042Ps2(e(charSequence), 4);
                return;
            case 2:
                autofillProfile.i = new C2042Ps2(e(charSequence), 4);
                return;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                autofillProfile.j = new C2042Ps2(e(charSequence), 4);
                return;
            case 4:
                autofillProfile.l = new C2042Ps2(e(charSequence), 4);
                return;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                autofillProfile.k = new C2042Ps2(e(charSequence), 4);
                return;
            case 6:
                autofillProfile.g = new C2042Ps2(e(charSequence), 4);
                return;
            case 7:
                autofillProfile.f = new C2042Ps2(e(charSequence), 4);
                return;
            case 8:
                autofillProfile.e = new C2042Ps2(e(charSequence), 4);
                return;
            default:
                return;
        }
    }

    public static String e(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence.toString();
    }

    @Override // org.chromium.chrome.browser.autofill.PersonalDataManager.GetSubKeysRequestDelegate
    public final void onSubKeysReceived(String[] strArr, String[] strArr2) {
        C1281Jw0 c1281Jw0;
        if (this.q) {
            return;
        }
        this.q = true;
        if (this.a.A) {
            return;
        }
        HashMap hashMap = this.d;
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr.length == strArr2.length) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < strArr.length; i++) {
                arrayList.add(new C1021Hw0(strArr[i], strArr2[i]));
            }
            Collator collator = Collator.getInstance(Locale.getDefault());
            collator.setStrength(0);
            Collections.sort(arrayList, new C6421ir(collator));
            c1281Jw0 = C1281Jw0.a(null, arrayList, this.b.getString(R.string.0_resource_name_obfuscated_res_0x7f1409e9));
        } else {
            c1281Jw0 = new C1281Jw0(5);
        }
        hashMap.put(1, c1281Jw0);
        if (this.r != null) {
            ProgressDialog progressDialog = this.v;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.v.dismiss();
            }
            this.v = null;
            c(this.r, Locale.getDefault().getLanguage());
            this.c.post(this.s);
            return;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ((C1281Jw0) entry.getValue()).s = C1634Mp.l(this.t, ((Integer) entry.getKey()).intValue());
        }
        c(this.l.s.toString(), this.t.getLanguageCode());
        this.a.h(this.u);
    }

    public final void g(String str) {
        this.q = false;
        this.a.A = false;
        if (5 * 1000 == 0) {
            onSubKeysReceived(null, null);
            return;
        }
        PersonalDataManager d = PersonalDataManager.d();
        d.getClass();
        Object obj = ThreadUtils.a;
        N.M4kIHYDl(d.a, d, str);
        PersonalDataManager d2 = PersonalDataManager.d();
        d2.getClass();
        N.M8TAYWBI(d2.a, d2, str, 5, this);
    }

    public final void c(String str, String str2) {
        C1281Jw0 c1281Jw0;
        this.p = this.k.a(str, str2);
        this.l.n = f(0);
        this.u.a(this.l);
        int i = 0;
        while (true) {
            if (i >= this.p.size()) {
                break;
            }
            C6764jr c6764jr = (C6764jr) this.p.get(i);
            if (c6764jr.a == 8 && (c1281Jw0 = this.m) != null) {
                this.u.a(c1281Jw0);
            }
            HashMap hashMap = this.d;
            int i2 = c6764jr.a;
            C1281Jw0 c1281Jw02 = (C1281Jw0) hashMap.get(Integer.valueOf(i2));
            c1281Jw02.p = c6764jr.b;
            c1281Jw02.z = c6764jr.d || i2 == 2 || i2 == 3;
            if (this.g && (c6764jr.c || i2 == 8)) {
                r1 = this.b.getString(R.string.0_resource_name_obfuscated_res_0x7f140841);
            }
            c1281Jw02.l = r1;
            c1281Jw02.n = f(i2);
            this.u.a(c1281Jw02);
            i++;
        }
        C1281Jw0 c1281Jw03 = this.n;
        M7 m7 = this.w;
        c1281Jw03.n = m7 != null ? m7.g : null;
        this.u.a(c1281Jw03);
        C1281Jw0 c1281Jw04 = this.o;
        if (c1281Jw04 != null) {
            this.u.a(c1281Jw04);
        }
    }
}
