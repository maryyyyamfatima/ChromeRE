package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class L03 implements View.OnLayoutChangeListener {
    public final /* synthetic */ SearchView a;

    public L03(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        SearchView searchView = this.a;
        View view2 = searchView.C;
        if (view2.getWidth() > 1) {
            Resources resources = searchView.getContext().getResources();
            int paddingLeft = searchView.w.getPaddingLeft();
            Rect rect = new Rect();
            boolean a = He4.a(searchView);
            if (searchView.O) {
                i9 = resources.getDimensionPixelSize(R.dimen.f27540_resource_name_obfuscated_res_0x7f08002a) + resources.getDimensionPixelSize(R.dimen.f27530_resource_name_obfuscated_res_0x7f080029);
            } else {
                i9 = 0;
            }
            SearchView.SearchAutoComplete searchAutoComplete = searchView.u;
            searchAutoComplete.getDropDownBackground().getPadding(rect);
            if (a) {
                i10 = -rect.left;
            } else {
                i10 = paddingLeft - (rect.left + i9);
            }
            searchAutoComplete.setDropDownHorizontalOffset(i10);
            searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + i9) - paddingLeft);
        }
    }
}
