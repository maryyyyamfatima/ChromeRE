package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.components.browser_ui.widget.tile.TileView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class CM3 {
    public static void a(PropertyModel propertyModel, TileView tileView, FD2 fd2) {
        PD2 pd2 = HM3.a;
        if (fd2 == pd2) {
            ((TextView) tileView.findViewById(R.id.tile_view_title)).setText((CharSequence) propertyModel.i(pd2));
            return;
        }
        ND2 nd2 = HM3.b;
        if (fd2 == nd2) {
            TextView textView = (TextView) tileView.findViewById(R.id.tile_view_title);
            int h = propertyModel.h(nd2);
            if (h <= 0) {
                h = 1;
            }
            textView.setLines(h);
            return;
        }
        PD2 pd22 = HM3.c;
        if (fd2 == pd22) {
            ((ImageView) tileView.findViewById(R.id.tile_view_icon)).setImageDrawable((Drawable) propertyModel.i(pd22));
            return;
        }
        PD2 pd23 = HM3.d;
        if (fd2 != pd23) {
            LD2 ld2 = HM3.g;
            if (fd2 == ld2) {
                tileView.findViewById(R.id.offline_badge).setVisibility(propertyModel.j(ld2) ? 0 : 8);
                return;
            }
            LD2 ld22 = HM3.e;
            if (fd2 == ld22) {
                boolean j = propertyModel.j(ld22);
                int dimensionPixelSize = tileView.getResources().getDimensionPixelSize(j ? R.dimen.0_resource_name_obfuscated_res_0x7f0807e9 : R.dimen.0_resource_name_obfuscated_res_0x7f0807ea);
                View findViewById = tileView.findViewById(R.id.tile_view_icon);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
                marginLayoutParams.width = dimensionPixelSize;
                marginLayoutParams.height = dimensionPixelSize;
                marginLayoutParams.topMargin = tileView.getResources().getDimensionPixelSize(j ? R.dimen.0_resource_name_obfuscated_res_0x7f0807e5 : R.dimen.0_resource_name_obfuscated_res_0x7f0807e7);
                findViewById.setLayoutParams(marginLayoutParams);
                b(propertyModel, tileView);
                return;
            }
            if (fd2 == HM3.f) {
                b(propertyModel, tileView);
                return;
            }
            PD2 pd24 = HM3.i;
            if (fd2 != pd24) {
                PD2 pd25 = HM3.j;
                if (fd2 == pd25) {
                    tileView.setOnClickListener((View.OnClickListener) propertyModel.i(pd25));
                    return;
                }
                PD2 pd26 = HM3.k;
                if (fd2 == pd26) {
                    tileView.setOnLongClickListener((View.OnLongClickListener) propertyModel.i(pd26));
                    return;
                }
                PD2 pd27 = HM3.l;
                if (fd2 == pd27) {
                    tileView.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) propertyModel.i(pd27));
                    return;
                }
                PD2 pd28 = HM3.h;
                if (fd2 == pd28) {
                    tileView.setContentDescription((CharSequence) propertyModel.i(pd28));
                    return;
                }
                return;
            }
            tileView.h = (Runnable) propertyModel.i(pd24);
            return;
        }
        ((ImageView) tileView.findViewById(R.id.tile_view_icon)).setImageTintList((ColorStateList) propertyModel.i(pd23));
    }

    public static void b(PropertyModel propertyModel, TileView tileView) {
        int h;
        if (!propertyModel.j(HM3.e)) {
            h = propertyModel.h(HM3.f);
        } else {
            h = tileView.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0807e9);
        }
        tileView.j.a = h;
    }
}
