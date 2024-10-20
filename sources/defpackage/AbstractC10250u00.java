package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.litho.TextContent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: u00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10250u00 {
    public static void e(int i, C1593Mg3 c1593Mg3, C1593Mg3 c1593Mg32) {
        Object d;
        if (c1593Mg3 == null || c1593Mg32 == null || (d = c1593Mg3.d(i)) == null) {
            return;
        }
        c1593Mg32.g(i, d);
    }

    public static void c(int i, int i2, C1593Mg3 c1593Mg3, C1593Mg3 c1593Mg32) {
        Object d;
        if ((c1593Mg32 == null || c1593Mg32.d(i) == null) ? false : true) {
            d = c1593Mg32.d(i);
            c1593Mg32.h(i);
        } else {
            d = c1593Mg3.d(i);
            c1593Mg3.h(i);
        }
        c1593Mg3.g(i2, d);
    }

    public static void d(int i, C1593Mg3 c1593Mg3, C1593Mg3 c1593Mg32) {
        if ((c1593Mg32 == null || c1593Mg32.d(i) == null) ? false : true) {
            c1593Mg32.h(i);
        } else {
            c1593Mg3.h(i);
        }
    }

    public static void b(View view, Drawable drawable, int i, C3975bk0 c3975bk0) {
        boolean z = true;
        if (c3975bk0 == null || !c3975bk0.c()) {
            if (!((i & 1) == 1)) {
                z = false;
            }
        }
        if (z && drawable.isStateful()) {
            drawable.setState(view.getDrawableState());
        }
    }

    public static TextContent a(List list) {
        int size = list.size();
        if (size == 1) {
            Object obj = list.get(0);
            return obj instanceof TextContent ? (TextContent) obj : TextContent.f;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            if (obj2 instanceof TextContent) {
                arrayList.addAll(((TextContent) obj2).getTextItems());
            }
        }
        return new C9907t00(arrayList);
    }
}
