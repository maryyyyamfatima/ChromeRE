package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.android.chrome.R;
import java.util.WeakHashMap;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.widget.ViewLookupCachingFrameLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class UA3 {
    public static void a(final PropertyModel propertyModel, ViewGroup viewGroup, FD2 fd2) {
        Drawable drawable;
        ViewLookupCachingFrameLayout viewLookupCachingFrameLayout = (ViewLookupCachingFrameLayout) viewGroup;
        if (fd2 != null) {
            LD2 ld2 = AbstractC9627sA3.i;
            if (ld2 == fd2) {
                ImageButton imageButton = (ImageButton) viewLookupCachingFrameLayout.c(R.id.tab_strip_item_button);
                int i = propertyModel.j(AbstractC9627sA3.o) ? R.drawable.0_resource_name_obfuscated_res_0x7f0904b8 : R.drawable.0_resource_name_obfuscated_res_0x7f0904b7;
                if (propertyModel.j(ld2)) {
                    Resources resources = viewLookupCachingFrameLayout.getResources();
                    Resources.Theme theme = viewLookupCachingFrameLayout.getContext().getTheme();
                    ThreadLocal threadLocal = GP2.a;
                    drawable = resources.getDrawable(i, theme);
                } else {
                    drawable = null;
                }
                viewLookupCachingFrameLayout.setForeground(drawable);
                String str = (String) propertyModel.i(AbstractC9627sA3.h);
                if (propertyModel.j(ld2)) {
                    imageButton.setOnClickListener(new View.OnClickListener() { // from class: SA3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            PD2 pd2 = AbstractC9627sA3.c;
                            PropertyModel propertyModel2 = PropertyModel.this;
                            ((InterfaceC0904Gy3) propertyModel2.i(pd2)).a(propertyModel2.h(AbstractC9627sA3.a));
                        }
                    });
                    imageButton.setContentDescription(viewLookupCachingFrameLayout.getContext().getString(R.string.0_resource_name_obfuscated_res_0x7f140179, str));
                    imageButton.getBackground().setAlpha(0);
                    return;
                } else {
                    imageButton.setOnClickListener(new View.OnClickListener() { // from class: TA3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            PD2 pd2 = AbstractC9627sA3.b;
                            PropertyModel propertyModel2 = PropertyModel.this;
                            ((InterfaceC0904Gy3) propertyModel2.i(pd2)).a(propertyModel2.h(AbstractC9627sA3.a));
                        }
                    });
                    imageButton.setContentDescription(viewLookupCachingFrameLayout.getContext().getString(R.string.0_resource_name_obfuscated_res_0x7f140181, str));
                    imageButton.getBackground().setAlpha(255);
                    return;
                }
            }
            PD2 pd2 = AbstractC9627sA3.d;
            if (pd2 == fd2) {
                Drawable drawable2 = ((C4747dy3) propertyModel.i(pd2)).a;
                ImageButton imageButton2 = (ImageButton) viewLookupCachingFrameLayout.c(R.id.tab_strip_item_button);
                imageButton2.setBackgroundResource(R.drawable.0_resource_name_obfuscated_res_0x7f0904b9);
                ColorStateList b = Y50.b(viewLookupCachingFrameLayout.getContext(), propertyModel.h(AbstractC9627sA3.q));
                WeakHashMap weakHashMap = Ec4.a;
                imageButton2.setBackgroundTintList(b);
                if (!propertyModel.j(ld2)) {
                    imageButton2.getBackground().setAlpha(255);
                } else {
                    imageButton2.getBackground().setAlpha(0);
                }
                if (drawable2 != null) {
                    imageButton2.setImageDrawable(drawable2);
                    return;
                }
                return;
            }
            return;
        }
        FD2[] fd2Arr = AbstractC9627sA3.F;
        for (int i2 = 0; i2 < 8; i2++) {
            a(propertyModel, viewLookupCachingFrameLayout, fd2Arr[i2]);
        }
    }
}
