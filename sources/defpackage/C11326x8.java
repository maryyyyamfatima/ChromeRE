package defpackage;

import android.widget.SearchView;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: x8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11326x8 implements SearchView.OnQueryTextListener {
    public final /* synthetic */ Callback a;

    @Override // android.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextSubmit(String str) {
        return false;
    }

    public C11326x8(Callback callback) {
        this.a = callback;
    }

    @Override // android.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextChange(String str) {
        this.a.onResult(str);
        return true;
    }
}
