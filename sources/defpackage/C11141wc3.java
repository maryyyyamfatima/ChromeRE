package defpackage;

import android.os.Bundle;
import android.util.Pair;
import androidx.preference.Preference;
import androidx.preference.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.site_settings.ChosenObjectSettings;
import org.chromium.components.browser_ui.site_settings.SingleCategorySettings;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wc3 */
/* loaded from: classes2.dex */
public final class C11141wc3 implements No4 {
    public final /* synthetic */ SingleCategorySettings a;

    public C11141wc3(SingleCategorySettings singleCategorySettings) {
        this.a = singleCategorySettings;
    }

    @Override // defpackage.No4
    public final void a(Collection collection) {
        Set emptySet;
        int i;
        boolean z;
        Integer d;
        SingleCategorySettings singleCategorySettings = this.a;
        if (singleCategorySettings.getActivity() == null) {
            return;
        }
        singleCategorySettings.V0();
        int b = C7034ke3.b(singleCategorySettings.m0.b);
        int i2 = 0;
        if ((b != 20 ? b != 35 ? (char) 65535 : (char) 19 : '4') == 65535) {
            if (singleCategorySettings.z0 != null) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!singleCategorySettings.z0.contains(T34.b(((C6408io4) it.next()).a.d(), true))) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                C6408io4 c6408io4 = (C6408io4) it2.next();
                String str = singleCategorySettings.n0;
                if (str == null || str.isEmpty() || c6408io4.g().contains(singleCategorySettings.n0)) {
                    arrayList.add(new Qo4(singleCategorySettings.c0.a, singleCategorySettings.j0, c6408io4, singleCategorySettings.m0));
                }
            }
            singleCategorySettings.t0 = 0;
            if (arrayList.size() == 0) {
                singleCategorySettings.X0(0);
                singleCategorySettings.W0(0, true);
                singleCategorySettings.Z0(0);
                return;
            }
            Collections.sort(arrayList);
            if (!singleCategorySettings.o0) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    singleCategorySettings.N0().W((Qo4) it3.next());
                }
                i = 0;
            } else {
                d dVar = (d) singleCategorySettings.N0().X("allowed_group");
                d dVar2 = (d) singleCategorySettings.N0().X("blocked_group");
                d dVar3 = (d) singleCategorySettings.N0().X("managed_group");
                if (singleCategorySettings.m0.o(14)) {
                    singleCategorySettings.j0.getClass();
                    emptySet = C11205wn1.a().a.g();
                } else {
                    emptySet = Collections.emptySet();
                }
                Iterator it4 = arrayList.iterator();
                i = 0;
                int i3 = 0;
                while (it4.hasNext()) {
                    Qo4 qo4 = (Qo4) it4.next();
                    if (!emptySet.contains(qo4.d0.a.d())) {
                        Profile profile = singleCategorySettings.j0.b;
                        int i4 = i2;
                        while (true) {
                            if (i4 >= 26) {
                                break;
                            }
                            if (!singleCategorySettings.m0.o(i4) || (d = qo4.d0.d(profile, C7034ke3.b(i4))) == null) {
                                i4++;
                            } else if (2 == d.intValue()) {
                                z = true;
                            }
                        }
                        z = false;
                        if (z) {
                            dVar2.W(qo4);
                            i3++;
                        } else {
                            dVar.W(qo4);
                            singleCategorySettings.t0++;
                        }
                        i2 = 0;
                    } else {
                        dVar3.W(qo4);
                        i++;
                    }
                }
                if (singleCategorySettings.m0.o(1)) {
                    dVar2.L(dVar.l + 1);
                }
                if (singleCategorySettings.s0) {
                    if (singleCategorySettings.t0 == 0) {
                        if (i3 == 0 && i > 0) {
                            singleCategorySettings.r0 = true;
                        } else {
                            singleCategorySettings.p0 = true;
                        }
                    }
                    singleCategorySettings.s0 = false;
                }
                if (!singleCategorySettings.p0) {
                    dVar2.a0();
                }
                if (!singleCategorySettings.q0) {
                    dVar.a0();
                }
                if (!singleCategorySettings.r0) {
                    dVar3.a0();
                }
                i2 = i3;
            }
            singleCategorySettings.X0(i2);
            singleCategorySettings.W0(singleCategorySettings.t0, true ^ singleCategorySettings.U0());
            singleCategorySettings.Z0(i);
            arrayList.size();
            return;
        }
        HashMap hashMap = new HashMap();
        Iterator it5 = collection.iterator();
        while (it5.hasNext()) {
            C6408io4 c6408io42 = (C6408io4) it5.next();
            c6408io42.getClass();
            Iterator it6 = new ArrayList(c6408io42.l).iterator();
            while (it6.hasNext()) {
                C5901hL c5901hL = (C5901hL) it6.next();
                String str2 = singleCategorySettings.n0;
                if (str2 == null || str2.isEmpty() || c5901hL.h.toLowerCase(Locale.getDefault()).contains(singleCategorySettings.n0)) {
                    Pair pair = (Pair) hashMap.get(c5901hL.i);
                    if (pair == null) {
                        pair = Pair.create(new ArrayList(), new ArrayList());
                        hashMap.put(c5901hL.i, pair);
                    }
                    ((ArrayList) pair.first).add(c5901hL);
                    ((ArrayList) pair.second).add(c6408io42);
                }
            }
        }
        singleCategorySettings.X0(0);
        singleCategorySettings.W0(0, true);
        singleCategorySettings.Z0(0);
        for (Pair pair2 : hashMap.values()) {
            Preference preference = new Preference(singleCategorySettings.c0.a, null);
            Bundle l = preference.l();
            l.putInt("org.chromium.chrome.preferences.content_settings_type", singleCategorySettings.m0.f());
            l.putString("title", singleCategorySettings.getActivity().getTitle().toString());
            l.putSerializable("org.chromium.chrome.preferences.object_infos", (Serializable) pair2.first);
            l.putSerializable("org.chromium.chrome.preferences.site_set", (Serializable) pair2.second);
            preference.J(L53.c(singleCategorySettings.K(), N50.c(singleCategorySettings.m0.f()).a));
            preference.R(((C5901hL) ((ArrayList) pair2.first).get(0)).h);
            preference.s = ChosenObjectSettings.class.getCanonicalName();
            singleCategorySettings.N0().W(preference);
        }
        hashMap.size();
    }
}
