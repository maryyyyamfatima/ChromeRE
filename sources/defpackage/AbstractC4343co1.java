package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.components.browser_ui.widget.listmenu.ListMenuButton;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: co1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4343co1 {
    public static void a(PropertyModel propertyModel, View view, FD2 fd2) {
        PD2 pd2 = AbstractC4000bo1.c;
        if (pd2 == fd2) {
            ((ImageView) view.findViewById(R.id.favicon)).setImageDrawable((Drawable) propertyModel.i(pd2));
            return;
        }
        PD2 pd22 = AbstractC4000bo1.d;
        if (pd22 == fd2) {
            TextView textView = (TextView) view.findViewById(R.id.title);
            String str = (String) propertyModel.i(pd22);
            if (str != null) {
                textView.setText(str);
                return;
            } else {
                textView.setVisibility(8);
                return;
            }
        }
        PD2 pd23 = AbstractC4000bo1.e;
        if (pd23 == fd2) {
            TextView textView2 = (TextView) view.findViewById(R.id.desc);
            String str2 = (String) propertyModel.i(pd23);
            if (str2 != null) {
                textView2.setText(str2);
                return;
            } else {
                textView2.setVisibility(8);
                return;
            }
        }
        LD2 ld2 = AbstractC4000bo1.a;
        if (ld2 == fd2) {
            boolean j = propertyModel.j(ld2);
            view.findViewById(R.id.current).setVisibility(j ? 0 : 4);
            view.findViewById(R.id.more).setVisibility(j ? 4 : 0);
            return;
        }
        PD2 pd24 = AbstractC4000bo1.g;
        if (pd24 == fd2) {
            view.setOnClickListener((View.OnClickListener) propertyModel.i(pd24));
            return;
        }
        PD2 pd25 = AbstractC4000bo1.h;
        if (pd25 != fd2) {
            LD2 ld22 = AbstractC4000bo1.b;
            if (ld22 == fd2) {
                View findViewById = view.findViewById(R.id.new_window);
                View findViewById2 = view.findViewById(R.id.max_info);
                boolean j2 = propertyModel.j(ld22);
                findViewById.setVisibility(j2 ? 0 : 8);
                findViewById2.setVisibility(j2 ? 8 : 0);
                return;
            }
            return;
        }
        ((ListMenuButton) view.findViewById(R.id.more)).e((ZC1) propertyModel.i(pd25), true);
    }
}
