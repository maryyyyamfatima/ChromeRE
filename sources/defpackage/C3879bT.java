package defpackage;

import androidx.fragment.app.c;
import org.chromium.chrome.browser.browsing_data.ClearBrowsingDataFetcher;
import org.chromium.chrome.browser.browsing_data.ClearBrowsingDataFragment;
import org.chromium.chrome.browser.browsing_data.ClearBrowsingDataFragmentAdvanced;
import org.chromium.chrome.browser.browsing_data.ClearBrowsingDataFragmentBasic;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bT */
/* loaded from: classes.dex */
public final class C3879bT extends LT0 {
    public final ClearBrowsingDataFetcher r;

    @Override // defpackage.AbstractC8305oK2
    public final int q() {
        return 2;
    }

    public C3879bT(ClearBrowsingDataFetcher clearBrowsingDataFetcher, VS0 vs0) {
        super(vs0);
        this.r = clearBrowsingDataFetcher;
    }

    @Override // defpackage.LT0
    public final c O(int i) {
        ClearBrowsingDataFragment clearBrowsingDataFragmentBasic;
        if (i == 0) {
            clearBrowsingDataFragmentBasic = new ClearBrowsingDataFragmentBasic();
        } else if (i == 1) {
            clearBrowsingDataFragmentBasic = new ClearBrowsingDataFragmentAdvanced();
        } else {
            throw new RuntimeException(AbstractC9076qb1.a("invalid position: ", i));
        }
        clearBrowsingDataFragmentBasic.m0 = this.r;
        return clearBrowsingDataFragmentBasic;
    }
}
