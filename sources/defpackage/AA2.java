package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import com.android.chrome.R;
import org.chromium.ui.widget.ButtonCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class AA2 {
    public final LayoutInflater a;
    public final ViewGroup b;
    public final View c;
    public ViewPager2 d;
    public FA2 e;
    public ButtonCompat f;
    public ButtonCompat g;
    public ButtonCompat h;
    public final QB i;

    public AA2(Context context, ViewGroup viewGroup, QB qb) {
        this.b = viewGroup;
        this.i = qb;
        LayoutInflater from = LayoutInflater.from(context);
        this.a = from;
        View inflate = from.inflate(R.layout.f59960_resource_name_obfuscated_res_0x7f0e021b, (ViewGroup) null);
        this.c = inflate;
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        toolbar.F(R.string.f81920_resource_name_obfuscated_res_0x7f140850);
        toolbar.s(R.menu.f62190_resource_name_obfuscated_res_0x7f10000a);
        toolbar.N = new BO3() { // from class: uA2
            @Override // defpackage.BO3
            public final boolean onMenuItemClick(MenuItem menuItem) {
                AA2 aa2 = AA2.this;
                aa2.getClass();
                if (menuItem.getItemId() != R.id.close_menu_id) {
                    return false;
                }
                ViewGroup viewGroup2 = aa2.b;
                viewGroup2.removeView(aa2.c);
                viewGroup2.setVisibility(8);
                return true;
            }
        };
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.dialog_content);
        frameLayout.removeAllViews();
        from.inflate(R.layout.f60060_resource_name_obfuscated_res_0x7f0e0225, frameLayout);
        ((ButtonCompat) inflate.findViewById(R.id.start_button)).setOnClickListener(new View.OnClickListener() { // from class: vA2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final AA2 aa2 = AA2.this;
                View view2 = aa2.c;
                FrameLayout frameLayout2 = (FrameLayout) view2.findViewById(R.id.dialog_content);
                frameLayout2.removeAllViews();
                aa2.a.inflate(R.layout.f60040_resource_name_obfuscated_res_0x7f0e0223, frameLayout2);
                aa2.d = (ViewPager2) view2.findViewById(R.id.review_viewpager);
                FA2 fa2 = new FA2(aa2.i);
                aa2.e = fa2;
                aa2.d.c(fa2);
                ButtonCompat buttonCompat = (ButtonCompat) view2.findViewById(R.id.next_button);
                aa2.f = buttonCompat;
                buttonCompat.setOnClickListener(new View.OnClickListener() { // from class: wA2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        AA2 aa22 = AA2.this;
                        int i = aa22.d.i + 1;
                        aa22.e.getClass();
                        if (i < 4) {
                            aa22.d.d(i, true);
                        }
                        aa22.g.setVisibility(0);
                        int i2 = i + 1;
                        aa22.e.getClass();
                        if (i2 == 4) {
                            aa22.f.setVisibility(8);
                            aa22.h.setVisibility(0);
                        }
                    }
                });
                ButtonCompat buttonCompat2 = (ButtonCompat) view2.findViewById(R.id.back_button);
                aa2.g = buttonCompat2;
                buttonCompat2.setOnClickListener(new View.OnClickListener() { // from class: xA2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        AA2 aa22 = AA2.this;
                        aa22.h.setVisibility(8);
                        ViewPager2 viewPager2 = aa22.d;
                        int i = viewPager2.i - 1;
                        if (i >= 0) {
                            viewPager2.d(i, true);
                        }
                        aa22.f.setVisibility(0);
                        if (i == 0) {
                            aa22.g.setVisibility(4);
                        }
                    }
                });
                ButtonCompat buttonCompat3 = (ButtonCompat) view2.findViewById(R.id.finish_button);
                aa2.h = buttonCompat3;
                buttonCompat3.setOnClickListener(new View.OnClickListener() { // from class: yA2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        final AA2 aa22 = AA2.this;
                        View view4 = aa22.c;
                        FrameLayout frameLayout3 = (FrameLayout) view4.findViewById(R.id.dialog_content);
                        frameLayout3.removeAllViews();
                        aa22.a.inflate(R.layout.f59970_resource_name_obfuscated_res_0x7f0e021c, frameLayout3);
                        ((ButtonCompat) view4.findViewById(R.id.done_button)).setOnClickListener(new View.OnClickListener() { // from class: zA2
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view5) {
                                AA2 aa23 = AA2.this;
                                View view6 = aa23.c;
                                ViewGroup viewGroup2 = aa23.b;
                                viewGroup2.removeView(view6);
                                viewGroup2.setVisibility(8);
                            }
                        });
                    }
                });
            }
        });
    }
}
