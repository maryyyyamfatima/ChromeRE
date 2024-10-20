package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import org.chromium.chrome.browser.search_resumption.SearchResumptionTileContainerView;
import org.chromium.chrome.browser.search_resumption.SearchResumptionTileView;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: u03, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10253u03 {
    public C6820k03 a;

    public C10253u03(C6820k03 c6820k03) {
        this.a = c6820k03;
    }

    public final SearchResumptionTileView a(String str, GURL gurl, SearchResumptionTileContainerView searchResumptionTileContainerView) {
        final SearchResumptionTileView searchResumptionTileView = (SearchResumptionTileView) LayoutInflater.from(searchResumptionTileContainerView.getContext()).inflate(R.layout.f60560_resource_name_obfuscated_res_0x7f0e025a, (ViewGroup) searchResumptionTileContainerView, false);
        searchResumptionTileView.a = gurl;
        searchResumptionTileView.g.setText(str);
        searchResumptionTileView.setContentDescription(searchResumptionTileView.g.getText());
        final C6820k03 c6820k03 = this.a;
        searchResumptionTileView.setOnClickListener(new View.OnClickListener() { // from class: x03
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GURL gurl2 = SearchResumptionTileView.this.a;
                C6820k03 c6820k032 = c6820k03;
                c6820k032.getClass();
                c6820k032.a.d(new LoadUrlParams(gurl2.i(), 0));
                FI2.a("SearchResumptionModule.NTP.Click");
            }
        });
        return searchResumptionTileView;
    }
}
