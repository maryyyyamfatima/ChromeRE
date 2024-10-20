package org.chromium.chrome.browser.toolbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import com.android.chrome.R;
import defpackage.C8385oa2;
import defpackage.Y50;
import org.chromium.base.Callback;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.toolbar.HomeButton;
import org.chromium.components.browser_ui.widget.listmenu.ListMenuButton;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class HomeButton extends ListMenuButton implements MenuItem.OnMenuItemClickListener {
    public static final /* synthetic */ int u = 0;
    public Callback s;
    public C8385oa2 t;

    public HomeButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object obj = Y50.a;
        setImageDrawable(context.getDrawable(R.drawable.f45220_resource_name_obfuscated_res_0x7f0900d9));
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.s.onResult(getContext());
        return true;
    }

    public final void g() {
        if (!((Boolean) this.t.g).booleanValue() && this.s != null) {
            setOnLongClickListener(new View.OnLongClickListener() { // from class: q91
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    int i = HomeButton.u;
                    final HomeButton homeButton = HomeButton.this;
                    homeButton.getClass();
                    ViewTreeObserverOnGlobalLayoutListenerC8754pe4 a = CS1.a(view);
                    C7616mK1 c7616mK1 = new C7616mK1();
                    c7616mK1.s(C4738dx.d(R.string.f79200_resource_name_obfuscated_res_0x7f140736, 0, R.drawable.f47430_resource_name_obfuscated_res_0x7f0901f3));
                    homeButton.e(new C9619s91(new C4738dx(homeButton.getContext(), c7616mK1, new SC1() { // from class: r91
                        @Override // defpackage.SC1
                        public final void b(PropertyModel propertyModel) {
                            HomeButton homeButton2 = HomeButton.this;
                            homeButton2.s.onResult(homeButton2.getContext());
                        }
                    }), a), false);
                    ((ListMenuButton) view).f();
                    return true;
                }
            });
        } else {
            setLongClickable(false);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TraceEvent i5 = TraceEvent.i("HomeButton.onLayout", null);
        try {
            super.onLayout(z, i, i2, i3, i4);
            if (i5 != null) {
                i5.close();
            }
        } catch (Throwable th) {
            if (i5 != null) {
                try {
                    i5.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        TraceEvent i3 = TraceEvent.i("HomeButton.onMeasure", null);
        try {
            super.onMeasure(i, i2);
            if (i3 != null) {
                i3.close();
            }
        } catch (Throwable th) {
            if (i3 != null) {
                try {
                    i3.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
