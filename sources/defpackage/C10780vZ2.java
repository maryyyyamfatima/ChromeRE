package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vZ2 */
/* loaded from: classes.dex */
public final class C10780vZ2 {
    public final PropertyModel a;
    public final ViewGroup b;
    public final AZ2 c;
    public boolean d;
    public WindowAndroid e;

    public C10780vZ2(Context context, ViewGroup viewGroup) {
        PropertyModel propertyModel = new PropertyModel(BZ2.v);
        this.a = propertyModel;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.search_box);
        this.b = viewGroup2;
        this.c = new AZ2(context, propertyModel, viewGroup2);
    }

    public final void b(View.OnClickListener onClickListener) {
        final AZ2 az2 = this.c;
        ArrayList arrayList = az2.h;
        boolean z = !arrayList.isEmpty();
        arrayList.add(onClickListener);
        if (z) {
            return;
        }
        az2.g.o(BZ2.g, new View.OnClickListener() { // from class: yZ2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Iterator it = AZ2.this.h.iterator();
                while (it.hasNext()) {
                    ((View.OnClickListener) it.next()).onClick(view);
                }
            }
        });
    }

    public final void a(View.OnClickListener onClickListener) {
        final AZ2 az2 = this.c;
        ArrayList arrayList = az2.i;
        boolean z = !arrayList.isEmpty();
        arrayList.add(onClickListener);
        if (z) {
            return;
        }
        az2.g.o(BZ2.i, new View.OnClickListener() { // from class: xZ2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Iterator it = AZ2.this.i.iterator();
                while (it.hasNext()) {
                    ((View.OnClickListener) it.next()).onClick(view);
                }
            }
        });
    }
}
