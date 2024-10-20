package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class M03 implements View.OnClickListener {
    public final /* synthetic */ SearchView a;

    public M03(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.a;
        ImageView imageView = searchView.y;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.u;
        if (view != imageView) {
            if (view == searchView.A) {
                searchView.l();
                return;
            }
            if (view == searchView.z) {
                searchView.m();
                return;
            } else {
                if (view != searchView.B && view == searchAutoComplete) {
                    searchView.k();
                    return;
                }
                return;
            }
        }
        searchView.r(false);
        searchAutoComplete.requestFocus();
        searchAutoComplete.b(true);
        View.OnClickListener onClickListener = searchView.N;
        if (onClickListener != null) {
            onClickListener.onClick(searchView);
        }
    }
}
