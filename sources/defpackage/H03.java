package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class H03 implements TextWatcher {
    public final /* synthetic */ SearchView a;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        SearchView searchView = this.a;
        TextUtils.isEmpty(searchView.u.getText());
        searchView.z.setVisibility(8);
        searchView.B.setVisibility(8);
        searchView.o();
        searchView.x.setVisibility(8);
        if (searchView.L != null && !TextUtils.equals(charSequence, searchView.T)) {
            searchView.L.onQueryTextChange(charSequence.toString());
        }
        searchView.T = charSequence.toString();
    }

    public H03(SearchView searchView) {
        this.a = searchView;
    }
}
