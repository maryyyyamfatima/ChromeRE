package defpackage;

import android.view.View;
import com.android.chrome.R;
import org.chromium.chrome.browser.searchwidget.SearchActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oZ2 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC8380oZ2 implements View.OnClickListener {
    public final /* synthetic */ SearchActivity a;

    public ViewOnClickListenerC8380oZ2(SearchActivity searchActivity) {
        this.a = searchActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = SearchActivity.f0;
        SearchActivity searchActivity = this.a;
        searchActivity.finish();
        searchActivity.overridePendingTransition(0, R.anim.0_resource_name_obfuscated_res_0x7f02000d);
    }
}
