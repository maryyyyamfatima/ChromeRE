package defpackage;

import android.os.Parcel;
import com.google.android.gms.languageprofile.LanguagePreference;
import com.google.android.gms.languageprofile.LanguagePreferenceParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.chromium.base.LocaleUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3361Zw1 {
    public static ArrayList a(final String str) {
        final C3101Xw1 c3101Xw1 = new C3101Xw1(V60.a);
        final LanguagePreferenceParams languagePreferenceParams = new LanguagePreferenceParams(-1.0f, 1, 2, null);
        C5531gF3 c5531gF3 = new C5531gF3();
        c5531gF3.a = new InterfaceC5565gM2() { // from class: Uw1
            @Override // defpackage.InterfaceC5565gM2
            public final void accept(Object obj, Object obj2) {
                C3101Xw1.this.getClass();
                InterfaceC6340id1 interfaceC6340id1 = (InterfaceC6340id1) ((C3231Yw1) obj).m();
                BinderC2971Ww1 binderC2971Ww1 = new BinderC2971Ww1((C6905kF3) obj2);
                C5652gd1 c5652gd1 = (C5652gd1) interfaceC6340id1;
                Parcel a = c5652gd1.a();
                a.writeString(str);
                AbstractC11786yV.b(a, languagePreferenceParams);
                AbstractC11786yV.c(a, binderC2971Ww1);
                c5652gd1.h(3, a);
            }
        };
        c5531gF3.d = 14401;
        AF3 b = c3101Xw1.b(0, c5531gF3.a());
        UF3.b(b, 60, TimeUnit.SECONDS);
        List list = (List) b.k();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((LanguagePreference) it.next()).a);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(LocaleUtils.c((Locale) it2.next()));
        }
        return arrayList2;
    }
}
