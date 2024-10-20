package org.chromium.chrome.browser.explore_sites;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.C6964kR2;
import defpackage.C8964qF0;
import defpackage.I60;
import defpackage.InterfaceC8544p12;
import java.util.ArrayList;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.suggestions.tile.MostVisitedTilesGridLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ExploreSitesCategoryCardView extends LinearLayout {
    public static final /* synthetic */ int u = 0;
    public final C8964qF0 a;
    public TextView g;
    public MostVisitedTilesGridLayout h;
    public C6964kR2 i;
    public I60 j;
    public InterfaceC8544p12 k;
    public Profile l;
    public ArrayList m;
    public ExploreSitesCategory n;
    public int o;
    public int p;
    public boolean q;
    public int r;
    public int s;
    public int t;

    public ExploreSitesCategoryCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = new ArrayList();
        this.a = new C8964qF0(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.g = (TextView) findViewById(R.id.category_title);
        this.h = (MostVisitedTilesGridLayout) findViewById(R.id.category_sites);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:            if (r0 > 1) goto L267;     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(org.chromium.chrome.browser.explore_sites.ExploreSitesCategory r8) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.explore_sites.ExploreSitesCategoryCardView.a(org.chromium.chrome.browser.explore_sites.ExploreSitesCategory):void");
    }
}
