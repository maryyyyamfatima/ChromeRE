package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Uy3 */
/* loaded from: classes.dex */
public abstract class AbstractC2723Uy3 {
    public static void a(final PropertyModel propertyModel, ViewGroup viewGroup, FD2 fd2) {
        PD2 pd2 = AbstractC9627sA3.h;
        if (pd2 == fd2) {
            ((TextView) viewGroup.findViewById(R.id.title)).setText((String) propertyModel.i(pd2));
            return;
        }
        PD2 pd22 = AbstractC9627sA3.d;
        if (pd22 != fd2) {
            PD2 pd23 = AbstractC9627sA3.c;
            if (pd23 == fd2) {
                if (propertyModel.i(pd23) == null) {
                    viewGroup.findViewById(R.id.end_button).setOnClickListener(null);
                    return;
                } else {
                    viewGroup.findViewById(R.id.end_button).setOnClickListener(new View.OnClickListener() { // from class: Qy3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ND2 nd2 = AbstractC9627sA3.a;
                            PropertyModel propertyModel2 = PropertyModel.this;
                            ((InterfaceC0904Gy3) propertyModel2.i(AbstractC9627sA3.c)).a(propertyModel2.h(nd2));
                        }
                    });
                    return;
                }
            }
            LD2 ld2 = AbstractC9627sA3.i;
            if (ld2 == fd2) {
                int h = propertyModel.h(AbstractC9627sA3.p);
                Resources resources = viewGroup.getResources();
                Resources.Theme theme = viewGroup.getContext().getTheme();
                ThreadLocal threadLocal = GP2.a;
                viewGroup.setForeground(propertyModel.j(ld2) ? new InsetDrawable(resources.getDrawable(h, theme), (int) resources.getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f0807ad)) : null);
                return;
            }
            PD2 pd24 = AbstractC9627sA3.b;
            if (pd24 == fd2) {
                if (propertyModel.i(pd24) == null) {
                    viewGroup.setOnClickListener(null);
                    return;
                } else {
                    viewGroup.setOnClickListener(new View.OnClickListener() { // from class: Ry3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ND2 nd2 = AbstractC9627sA3.a;
                            PropertyModel propertyModel2 = PropertyModel.this;
                            ((InterfaceC0904Gy3) propertyModel2.i(AbstractC9627sA3.b)).a(propertyModel2.h(nd2));
                        }
                    });
                    return;
                }
            }
            PD2 pd25 = AbstractC9627sA3.t;
            if (pd25 == fd2) {
                ((TextView) viewGroup.findViewById(R.id.description)).setText((String) propertyModel.i(pd25));
                return;
            }
            return;
        }
        Drawable drawable = ((C4747dy3) propertyModel.i(pd22)).a;
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.start_icon);
        imageView.setBackgroundResource(R.drawable.0_resource_name_obfuscated_res_0x7f090371);
        imageView.setImageDrawable(drawable);
    }
}
