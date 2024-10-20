package defpackage;

import J.N;
import android.os.Handler;
import com.android.chrome.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.autofill.PersonalDataManager;
import org.chromium.chrome.browser.autofill.settings.AutofillProfileBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class L7 extends AbstractC10229tw0 {
    public final boolean h;
    public AutofillProfileBridge k;
    public C1281Jw0 l;
    public C1281Jw0 m;
    public C1281Jw0 n;
    public C1281Jw0 o;
    public C1281Jw0 p;
    public ArrayList q;
    public String r;
    public PersonalDataManager.AutofillProfile s;
    public C1930Ow0 t;
    public final Handler c = new Handler();
    public final HashMap d = new HashMap();
    public final HashSet e = new HashSet();
    public final int f = 2;
    public final boolean g = false;
    public final C2827Vt2 i = new C2827Vt2();
    public final J7 j = new J7(true);

    public L7(boolean z) {
        this.h = z;
    }

    public final void d(final C1634Mp c1634Mp, final Callback callback, final Callback callback2) {
        String string;
        final C1634Mp c1634Mp2;
        if (this.k == null) {
            this.k = new AutofillProfileBridge();
        }
        int i = this.f;
        if (c1634Mp == null) {
            c1634Mp2 = new C1634Mp(this.b, new PersonalDataManager.AutofillProfile(), i == 1 ? 1 : 0);
            string = this.b.getString(R.string.f68110_resource_name_obfuscated_res_0x7f140223);
        } else {
            string = this.b.getString(R.string.f68240_resource_name_obfuscated_res_0x7f140230);
            c1634Mp2 = c1634Mp;
        }
        this.t = new C1930Ow0(string, this.r);
        this.s = c1634Mp2.q;
        if (this.l == null) {
            this.l = C1281Jw0.a(this.b.getString(R.string.f68550_resource_name_obfuscated_res_0x7f14024f), AutofillProfileBridge.b(), null);
        }
        C1281Jw0 c1281Jw0 = this.l;
        c1281Jw0.u = new H7(this);
        c1281Jw0.s = C1634Mp.j(this.s);
        this.j.a = this.l.s.toString();
        this.i.g = this.l.s.toString();
        if (i == 2) {
            C7928nE c7928nE = UN.a;
            if (N.M09VlOh_("AutofillEnableSupportForHonorificPrefixes")) {
                if (this.m == null) {
                    C1281Jw0 b = C1281Jw0.b();
                    this.m = b;
                    b.p = this.b.getString(R.string.f68570_resource_name_obfuscated_res_0x7f140251);
                }
                this.m.s = this.s.getHonorificPrefix();
            }
        }
        HashMap hashMap = this.d;
        if (hashMap.isEmpty()) {
            hashMap.put(1, C1281Jw0.b());
            hashMap.put(2, C1281Jw0.b());
            hashMap.put(3, C1281Jw0.b());
            hashMap.put(7, C1281Jw0.b());
            hashMap.put(4, new C1281Jw0(6));
            hashMap.put(5, new C1281Jw0(6));
            hashMap.put(6, new C1281Jw0(3));
            hashMap.put(8, new C1281Jw0(4));
        }
        if (i == 2) {
            if (this.n == null) {
                this.n = C1281Jw0.c(1, this.b.getString(R.string.f68580_resource_name_obfuscated_res_0x7f140252), this.e, this.i, this.j, null, this.g ? this.b.getString(R.string.f81770_resource_name_obfuscated_res_0x7f140841) : null, this.b.getString(R.string.f81500_resource_name_obfuscated_res_0x7f140823), null);
            }
            this.n.s = this.s.getPhoneNumber();
            if (this.o == null) {
                this.o = C1281Jw0.c(2, this.b.getString(R.string.f68560_resource_name_obfuscated_res_0x7f140250), null, null, null, null, null, this.b.getString(R.string.f81380_resource_name_obfuscated_res_0x7f140817), null);
            }
            this.o.s = this.s.getEmailAddress();
        }
        C7928nE c7928nE2 = UN.a;
        if (N.M09VlOh_("AutofillAddressProfileSavePromptNicknameSupport") && this.p == null) {
            C1281Jw0 b2 = C1281Jw0.b();
            this.p = b2;
            b2.p = "Label";
        }
        C1930Ow0 c1930Ow0 = this.t;
        c1930Ow0.e = new Runnable() { // from class: D7
            @Override // java.lang.Runnable
            public final void run() {
                Callback.this.onResult(c1634Mp);
            }
        };
        c1930Ow0.d = new Runnable() { // from class: F7
            @Override // java.lang.Runnable
            public final void run() {
                HashMap hashMap2;
                L7 l7 = L7.this;
                PersonalDataManager.AutofillProfile autofillProfile = l7.s;
                String charSequence = l7.l.s.toString();
                autofillProfile.getClass();
                autofillProfile.m = new C2042Ps2(charSequence, 4);
                C1281Jw0 c1281Jw02 = l7.n;
                if (c1281Jw02 != null) {
                    autofillProfile.n = new C2042Ps2(c1281Jw02.s.toString(), 4);
                }
                C1281Jw0 c1281Jw03 = l7.o;
                if (c1281Jw03 != null) {
                    autofillProfile.o = new C2042Ps2(c1281Jw03.s.toString(), 4);
                }
                C1281Jw0 c1281Jw04 = l7.m;
                if (c1281Jw04 != null) {
                    autofillProfile.d = new C2042Ps2(c1281Jw04.s.toString(), 4);
                }
                autofillProfile.q = l7.k.a;
                HashSet hashSet = new HashSet();
                int i2 = 0;
                while (true) {
                    int size = l7.q.size();
                    hashMap2 = l7.d;
                    if (i2 >= size) {
                        break;
                    }
                    C6764jr c6764jr = (C6764jr) l7.q.get(i2);
                    hashSet.add(Integer.valueOf(c6764jr.a));
                    int i3 = c6764jr.a;
                    if (i3 != 0) {
                        L7.f(autofillProfile, i3, ((C1281Jw0) hashMap2.get(Integer.valueOf(i3))).s);
                    }
                    i2++;
                }
                for (Map.Entry entry : hashMap2.entrySet()) {
                    if (!hashSet.contains(entry.getKey())) {
                        L7.f(autofillProfile, ((Integer) entry.getKey()).intValue(), "");
                    }
                }
                if (l7.h) {
                    PersonalDataManager d = PersonalDataManager.d();
                    PersonalDataManager.AutofillProfile autofillProfile2 = l7.s;
                    d.getClass();
                    Object obj = ThreadUtils.a;
                    autofillProfile.a = N.McRRW$S3(d.a, d, autofillProfile2);
                }
                if (autofillProfile.getGUID().isEmpty()) {
                    autofillProfile.a = UUID.randomUUID().toString();
                }
                autofillProfile.c = true;
                boolean z = l7.g;
                C1634Mp c1634Mp3 = c1634Mp2;
                if (z) {
                    c1634Mp3.o(l7.s);
                } else {
                    c1634Mp3.o(l7.s);
                }
                callback.onResult(c1634Mp3);
            }
        };
        for (Map.Entry entry : hashMap.entrySet()) {
            ((C1281Jw0) entry.getValue()).s = C1634Mp.l(this.s, ((Integer) entry.getKey()).intValue());
        }
        c(this.l.s.toString(), this.s.getLanguageCode());
        this.a.h(this.t);
    }

    public static void f(PersonalDataManager.AutofillProfile autofillProfile, int i, CharSequence charSequence) {
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

    public final void c(String str, String str2) {
        C1281Jw0 c1281Jw0;
        this.q = this.k.a(str, str2);
        this.t.a(this.l);
        for (int i = 0; i < this.q.size(); i++) {
            C6764jr c6764jr = (C6764jr) this.q.get(i);
            if (c6764jr.a == 8 && (c1281Jw0 = this.m) != null) {
                this.t.a(c1281Jw0);
            }
            HashMap hashMap = this.d;
            int i2 = c6764jr.a;
            C1281Jw0 c1281Jw02 = (C1281Jw0) hashMap.get(Integer.valueOf(i2));
            c1281Jw02.p = c6764jr.b;
            c1281Jw02.z = c6764jr.d || i2 == 2 || i2 == 3;
            c1281Jw02.l = (this.g && (c6764jr.c || i2 == 8)) ? this.b.getString(R.string.f81770_resource_name_obfuscated_res_0x7f140841) : null;
            this.t.a(c1281Jw02);
        }
        C1281Jw0 c1281Jw03 = this.n;
        if (c1281Jw03 != null) {
            this.t.a(c1281Jw03);
        }
        C1281Jw0 c1281Jw04 = this.o;
        if (c1281Jw04 != null) {
            this.t.a(c1281Jw04);
        }
        C1281Jw0 c1281Jw05 = this.p;
        if (c1281Jw05 != null) {
            this.t.a(c1281Jw05);
        }
    }
}
