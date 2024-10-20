package defpackage;

import android.view.MenuItem;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xw0 */
/* loaded from: classes.dex */
public final class C11601xw0 implements BO3 {
    public final /* synthetic */ ViewOnClickListenerC0501Dw0 a;

    public C11601xw0(ViewOnClickListenerC0501Dw0 viewOnClickListenerC0501Dw0) {
        this.a = viewOnClickListenerC0501Dw0;
    }

    @Override // defpackage.BO3
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        ViewOnClickListenerC0501Dw0 viewOnClickListenerC0501Dw0 = this.a;
        if (itemId == R.id.delete_menu_id) {
            viewOnClickListenerC0501Dw0.z.run();
            viewOnClickListenerC0501Dw0.b();
            return true;
        }
        if (menuItem.getItemId() != R.id.help_menu_id) {
            return true;
        }
        AbstractC1774Nr.e(viewOnClickListenerC0501Dw0.a, viewOnClickListenerC0501Dw0.B);
        return true;
    }
}
