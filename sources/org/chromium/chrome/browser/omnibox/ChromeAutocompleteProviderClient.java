package org.chromium.chrome.browser.omnibox;

import java.util.ArrayList;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ChromeAutocompleteProviderClient {
    public static Tab[] getAllHiddenTabs(TabModel[] tabModelArr) {
        if (tabModelArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (TabModel tabModel : tabModelArr) {
            if (tabModel != null) {
                for (int i = 0; i < tabModel.getCount(); i++) {
                    Tab tabAt = tabModel.getTabAt(i);
                    if (tabAt.isHidden()) {
                        arrayList.add(tabAt);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (Tab[]) arrayList.toArray(new Tab[0]);
    }
}
