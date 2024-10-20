package org.chromium.chrome.browser.tasks.tab_management;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.DK2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class h extends DK2 {
    public final /* synthetic */ TabListRecyclerView a;

    public h(TabListRecyclerView tabListRecyclerView) {
        this.a = tabListRecyclerView;
    }

    @Override // defpackage.DK2
    public final void s(RecyclerView recyclerView, int i, int i2) {
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        TabListRecyclerView tabListRecyclerView = this.a;
        if (computeVerticalScrollOffset == 0) {
            tabListRecyclerView.x0(false);
        } else {
            if (i2 == 0 || recyclerView.T == 2) {
                return;
            }
            tabListRecyclerView.x0(computeVerticalScrollOffset > 0);
        }
    }
}
