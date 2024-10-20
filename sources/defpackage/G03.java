package defpackage;

import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class G03 {
    public static void c(final MenuItem menuItem, String str, final Activity activity, final F03 f03) {
        final SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.u.setImeOptions(33554432);
        if (str != null) {
            menuItem.expandActionView();
            searchView.r(false);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.u;
            searchAutoComplete.requestFocus();
            searchAutoComplete.b(true);
            View.OnClickListener onClickListener = searchView.N;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
            }
            searchView.n(str);
            d(menuItem, str, activity);
        }
        menuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: A03
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem2) {
                G03.d(menuItem, "", activity);
                f03.onQueryTextChange("");
                return false;
            }
        });
        ((ImageView) searchView.findViewById(R.id.search_close_btn)).setOnClickListener(new View.OnClickListener() { // from class: B03
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchView.this.n("");
                G03.d(menuItem, "", activity);
                f03.onQueryTextChange("");
            }
        });
        ((ImageView) searchView.findViewById(R.id.search_close_btn)).addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: C03
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                G03.d(menuItem, searchView.u.getText().toString(), activity);
            }
        });
        searchView.N = new View.OnClickListener() { // from class: D03
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                G03.d(menuItem, "", activity);
                f03.onQueryTextChange("");
            }
        };
        searchView.L = new E03(menuItem, activity, f03);
    }

    public static boolean b(MenuItem menuItem, MenuItem menuItem2, String str, Activity activity) {
        if (menuItem.getItemId() != 16908332 || str == null) {
            return false;
        }
        a(menuItem2, activity);
        return true;
    }

    public static void a(MenuItem menuItem, Activity activity) {
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.n(null);
        searchView.l();
        menuItem.collapseActionView();
        d(menuItem, null, activity);
    }

    public static void d(MenuItem menuItem, String str, Activity activity) {
        View a;
        ((ImageView) ((SearchView) menuItem.getActionView()).findViewById(R.id.search_close_btn)).setVisibility((str == null || str.equals("")) ? 8 : 0);
        if (activity != null) {
            int i = str != null ? 8 : 0;
            Toolbar toolbar = (Toolbar) activity.findViewById(R.id.action_bar);
            if (toolbar == null || (a = AR3.a(toolbar)) == null) {
                return;
            }
            a.setVisibility(i);
        }
    }
}
