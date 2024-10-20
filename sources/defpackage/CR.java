package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.chromium.chrome.browser.ChromeTabbedActivity;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CR implements InterfaceC0259Bz3 {
    public final /* synthetic */ ChromeTabbedActivity a;

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void c(TabModel tabModel, TabModel tabModel2) {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void g(Tab tab) {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void l(int i, Tab tab) {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void a() {
        int i;
        ChromeTabbedActivity chromeTabbedActivity = this.a;
        if (chromeTabbedActivity.m1) {
            TabModel j = chromeTabbedActivity.Z0.j(false);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            int i2 = 0;
            for (int i3 = 0; i3 < j.getCount(); i3++) {
                Tab tabAt = j.getTabAt(i3);
                String i4 = tabAt.getUrl().i();
                if (hashMap2.containsKey(i4)) {
                    i2++;
                    i = ((Integer) hashMap2.get(i4)).intValue();
                } else {
                    i = 0;
                }
                hashMap2.put(i4, Integer.valueOf(i + 1));
                int i5 = C1695Nb0.m(tabAt).q;
                if (!hashMap.containsKey(Integer.valueOf(i5))) {
                    hashMap.put(Integer.valueOf(i5), new ArrayList());
                }
                ((List) hashMap.get(Integer.valueOf(i5))).add(Integer.valueOf(tabAt.getId()));
            }
            int count = j.getCount();
            if (count != 0 && i2 < count) {
                EI2.e(i2, "Tabs.Tasks.DuplicatedTab.DuplicatedTabCount");
                EI2.l((i2 * 100) / count, "Tabs.Tasks.DuplicatedTab.DuplicatedTabRatio");
            }
            List list = (List) hashMap.get(-1);
            if (list == null) {
                return;
            }
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                int a = AbstractC7598mG3.a(hashMap, ((Integer) list.get(i8)).intValue());
                if (a > 1) {
                    i7 += a;
                    i6++;
                }
            }
            int count2 = j.getCount();
            if (count2 == 0) {
                return;
            }
            EI2.e(i6, "Tabs.Tasks.TabGroupCount");
            EI2.e(i7, "Tabs.Tasks.TabsInGroupCount");
            double d = count2;
            EI2.l((int) (((i7 * 1.0d) / d) * 100.0d), "Tabs.Tasks.TabsInGroupRatio");
            if (i6 != 0) {
                EI2.e(i7 / i6, "Tabs.Tasks.AverageTabGroupSize");
            }
            EI2.l((int) (((i6 * 1.0d) / d) * 100.0d), "Tabs.Tasks.TabGroupDensity");
        }
    }

    public CR(ChromeTabbedActivity chromeTabbedActivity) {
        this.a = chromeTabbedActivity;
    }
}
