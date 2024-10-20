package defpackage;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.chrome.browser.ntp.RecentTabsGroupView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nI2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7951nI2 {
    public final /* synthetic */ C10695vI2 a;

    public void a(int i, C10352uI2 c10352uI2) {
    }

    public abstract void b(RecentTabsGroupView recentTabsGroupView, boolean z);

    public Object c(int i) {
        return null;
    }

    public abstract int d();

    public abstract int f();

    public abstract int g();

    public abstract boolean i();

    public boolean j(int i) {
        return false;
    }

    public void k(int i, ContextMenu contextMenu) {
    }

    public void l(ContextMenu contextMenu) {
    }

    public abstract void m(boolean z);

    public View e(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.a.a).inflate(R.layout.f60440_resource_name_obfuscated_res_0x7f0e024e, viewGroup, false);
            C10352uI2 c10352uI2 = new C10352uI2();
            c10352uI2.a = (TextView) view.findViewById(R.id.title_row);
            c10352uI2.b = (TextView) view.findViewById(R.id.domain_row);
            ImageView imageView = (ImageView) view.findViewById(R.id.recent_tabs_favicon);
            c10352uI2.c = imageView;
            imageView.setBackgroundResource(R.drawable.f51090_resource_name_obfuscated_res_0x7f090371);
            c10352uI2.d = view.findViewById(R.id.recent_tabs_list_item_layout);
            view.setTag(c10352uI2);
        }
        a(i, (C10352uI2) view.getTag());
        return view;
    }

    public AbstractC7951nI2(C10695vI2 c10695vI2) {
        this.a = c10695vI2;
    }

    public View h(boolean z, View view, ViewGroup viewGroup) {
        RecentTabsGroupView recentTabsGroupView = (RecentTabsGroupView) view;
        if (recentTabsGroupView == null) {
            recentTabsGroupView = (RecentTabsGroupView) LayoutInflater.from(this.a.a).inflate(R.layout.f60410_resource_name_obfuscated_res_0x7f0e024b, viewGroup, false);
        }
        b(recentTabsGroupView, z);
        return recentTabsGroupView;
    }
}
