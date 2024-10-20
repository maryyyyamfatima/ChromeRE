package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.d;
import com.android.chrome.R;
import java.util.WeakHashMap;
import org.chromium.components.browser_ui.widget.listmenu.ListMenuButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fw1 */
/* loaded from: classes.dex */
public final class C0762Fw1 extends d {
    public final TextView A;
    public final ImageView B;
    public final ListMenuButton C;
    public final TextView z;

    public C0762Fw1(View view) {
        super(view);
        this.z = (TextView) view.findViewById(R.id.title);
        this.A = (TextView) view.findViewById(R.id.description);
        this.B = (ImageView) view.findViewById(R.id.icon_view);
        this.C = (ListMenuButton) view.findViewById(R.id.more);
    }

    public final void v(ZC1 zc1) {
        ListMenuButton listMenuButton = this.C;
        listMenuButton.setVisibility(0);
        listMenuButton.e(zc1, true);
        WeakHashMap weakHashMap = Ec4.a;
        View view = this.a;
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), 0, view.getPaddingBottom());
    }
}
