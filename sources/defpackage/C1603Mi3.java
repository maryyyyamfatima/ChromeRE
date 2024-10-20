package defpackage;

import J.N;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.site_engagement.SiteEngagementService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mi3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1603Mi3 implements InterfaceC4480dB3 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC4480dB3
    public final List a(C6448iv3 c6448iv3) {
        double size;
        double d;
        List<C6106hv3> list = c6448iv3.a;
        if (list == null) {
            return null;
        }
        int size2 = list.size();
        C7928nE c7928nE = UN.a;
        if (size2 < N.M37SqSAy("CloseTabSuggestions", "close_tab_suggestions_stale_time_ms", 3)) {
            return null;
        }
        if (!N.M6bsIDpc("CloseTabSuggestions", "close_tab_features_time_last_used_enabled", false) && !N.M6bsIDpc("CloseTabSuggestions", "close_tab_features_site_engagement_enabled", false)) {
            return null;
        }
        ArrayList<C6106hv3> arrayList = new ArrayList();
        arrayList.addAll(list);
        if (N.M6bsIDpc("CloseTabSuggestions", "close_tab_features_time_last_used_enabled", false)) {
            String MMltG$kc = N.MMltG$kc("CloseTabSuggestions", "close_tab_features_time_last_used_transform");
            if (MMltG$kc == null) {
                AbstractC4851eH1.a("AdvStaleTabSuggest", "Time last used enabled but no transform string provided", new Object[0]);
                return null;
            }
            char c = !MMltG$kc.equals("MEAN_VARIANCE") ? !MMltG$kc.equals("DAY_NORMALIZATION") ? (char) 2 : (char) 0 : (char) 1;
            HashMap hashMap = new HashMap();
            if (c == 0) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    hashMap.put((C6106hv3) it.next(), Double.valueOf((System.currentTimeMillis() - r4.h) / TimeUnit.DAYS.toMillis(1L)));
                }
            } else if (c == 1) {
                if (list.isEmpty()) {
                    size = 0.0d;
                } else {
                    double d2 = 0.0d;
                    while (list.iterator().hasNext()) {
                        d2 += ((C6106hv3) r4.next()).h;
                    }
                    size = d2 / list.size();
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    hashMap.put((C6106hv3) it2.next(), Double.valueOf(r12.h - size));
                }
                Collection<Double> values = hashMap.values();
                if (values == null || values.size() <= 1) {
                    d = 1.0d;
                } else {
                    d = 0.0d;
                    for (Double d3 : values) {
                        d += d3.doubleValue() * d3.doubleValue();
                    }
                }
                for (C6106hv3 c6106hv3 : list) {
                    hashMap.put(c6106hv3, Double.valueOf(((Double) hashMap.get(c6106hv3)).doubleValue() / Math.sqrt(d)));
                }
            }
            C7928nE c7928nE2 = UN.a;
            double MQdjXFDB = N.MQdjXFDB("CloseTabSuggestions", "close_tab_features_time_last_used_threshold", 0.5d);
            arrayList = new ArrayList();
            for (Map.Entry entry : hashMap.entrySet()) {
                if (c == 1) {
                    if (((Double) entry.getValue()).doubleValue() < MQdjXFDB) {
                        arrayList.add((C6106hv3) entry.getKey());
                    }
                } else if (c == 0 && ((Double) entry.getValue()).doubleValue() > MQdjXFDB) {
                    arrayList.add((C6106hv3) entry.getKey());
                }
            }
        }
        C7928nE c7928nE3 = UN.a;
        if (N.M6bsIDpc("CloseTabSuggestions", "close_tab_features_site_engagement_enabled", false)) {
            double MQdjXFDB2 = N.MQdjXFDB("CloseTabSuggestions", "close_tab_features_site_engagement_threshold", 100.0d);
            LinkedList linkedList = new LinkedList();
            for (C6106hv3 c6106hv32 : arrayList) {
                c6106hv32.getClass();
                SiteEngagementService siteEngagementService = (SiteEngagementService) N.Ml4trBg9(Profile.d());
                long j = siteEngagementService.a;
                if ((j == 0 ? 0.0d : N.MVTED07I(j, siteEngagementService, c6106hv32.k)) < MQdjXFDB2) {
                    linkedList.add(c6106hv32);
                }
            }
            arrayList = linkedList;
        }
        return Arrays.asList(new VA3(1, arrayList));
    }
}
