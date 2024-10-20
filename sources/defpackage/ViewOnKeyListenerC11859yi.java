package defpackage;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnKeyListenerC11859yi implements AdapterView.OnItemClickListener, View.OnKeyListener, InterfaceC0300Ci {
    public static Callback w;
    public final int a;
    public final int g;
    public final int h;
    public final int i;
    public final int[] j;
    public PopupWindow k;
    public ListView l;
    public C7342lY1 m;
    public final C1340Ki n;
    public View o;
    public int p = -1;
    public boolean q;
    public AnimatorSet r;
    public long s;
    public boolean t;
    public Integer u;
    public C7616mK1 v;

    public ViewOnKeyListenerC11859yi(int i, C1340Ki c1340Ki, Resources resources) {
        this.a = i;
        this.n = c1340Ki;
        this.h = resources.getDimensionPixelSize(R.dimen.f35570_resource_name_obfuscated_res_0x7f0804d2);
        this.g = resources.getDimensionPixelSize(R.dimen.f35600_resource_name_obfuscated_res_0x7f0804d5);
        resources.getDimensionPixelSize(R.dimen.f35580_resource_name_obfuscated_res_0x7f0804d3);
        this.i = resources.getDimensionPixelOffset(R.dimen.f35520_resource_name_obfuscated_res_0x7f0804cb);
        this.j = new int[2];
    }

    public final void b(PropertyModel propertyModel) {
        if (propertyModel.j(AbstractC1470Li.d)) {
            int h = propertyModel.h(AbstractC1470Li.a);
            int i = 1;
            this.t = true;
            a();
            Integer num = this.u;
            boolean z = num != null && num.intValue() == h;
            C1340Ki c1340Ki = this.n;
            c1340Ki.m.O(h, c1340Ki.l.g(h));
            if (z) {
                Integer valueOf = Integer.valueOf(h);
                if (valueOf != null) {
                    if (valueOf.intValue() != R.id.downloads_menu_id) {
                        if (valueOf.intValue() == R.id.all_bookmarks_menu_id) {
                            i = 2;
                        } else if (valueOf.intValue() == R.id.translate_id) {
                            i = 3;
                        } else if (valueOf.intValue() == R.id.add_to_homescreen_id) {
                            i = 4;
                        } else if (valueOf.intValue() == R.id.offline_page_id) {
                            i = 5;
                        } else if (valueOf.intValue() == R.id.bookmark_this_page_id) {
                            i = 6;
                        } else if (valueOf.intValue() == R.id.app_menu_footer) {
                            i = 7;
                        }
                    }
                    EI2.h(i, 8, "Mobile.AppMenu.HighlightMenuItem.Clicked");
                }
                i = 0;
                EI2.h(i, 8, "Mobile.AppMenu.HighlightMenuItem.Clicked");
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        b(((C7272lK1) this.v.get(i)).b);
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.l != null && keyEvent.getKeyCode() == 82) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyEvent.startTracking();
                view.getKeyDispatcherState().startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1) {
                view.getKeyDispatcherState().handleUpEvent(keyEvent);
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    a();
                    return true;
                }
            }
        }
        return false;
    }

    public final void a() {
        PopupWindow popupWindow = this.k;
        if (popupWindow == null ? false : popupWindow.isShowing()) {
            this.k.dismiss();
        }
    }
}
