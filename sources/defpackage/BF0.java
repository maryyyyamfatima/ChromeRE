package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.chrome.R;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class BF0 {
    public final Activity a;
    public final C12075zK0 b;
    public final FF0 c;
    public final boolean d;
    public long e;
    public boolean f;
    public long g;
    public long h;

    public BF0(Profile profile, Activity activity, boolean z, boolean z2, QB qb, FY2 fy2, int i, InterfaceC0079Ap3 interfaceC0079Ap3, long j, ZK0 zk0, ViewGroup viewGroup, InterfaceC0079Ap3 interfaceC0079Ap32, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3, InterfaceC0079Ap3 interfaceC0079Ap33, C4270cc0 c4270cc0, WindowAndroid windowAndroid) {
        this.a = activity;
        this.c = new FF0(interfaceC0079Ap32);
        this.d = z2;
        C12075zK0 c12075zK0 = new C12075zK0(activity, viewOnClickListenerC1069If3, windowAndroid, null, null, activity.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080803), z, new C12050zF0(), profile, z2, qb, interfaceC0079Ap33, fy2, i, C9626sA2.g(), interfaceC0079Ap3, 2, j, zk0, true, viewGroup, new AF0(this, viewOnClickListenerC1069If3, new BookmarkBridge(profile), c4270cc0), C12008z71.a());
        this.b = c12075zK0;
        c12075zK0.o.setId(R.id.start_surface_explore_view);
    }
}
