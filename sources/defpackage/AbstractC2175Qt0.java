package defpackage;

import android.content.Context;
import com.google.android.libraries.elements.interfaces.ClientResourceProxy;
import com.google.android.libraries.elements.interfaces.ImageProxy;
import com.google.android.libraries.elements.interfaces.ImageSourceProxy;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qt0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2175Qt0 {
    public static final HashMap a = new HashMap();

    public static int a(Context context, ImageProxy imageProxy) {
        String imageName;
        int intValue;
        Iterator it = imageProxy.sources().iterator();
        while (it.hasNext()) {
            ClientResourceProxy clientResource = ((ImageSourceProxy) it.next()).clientResource();
            if (clientResource != null && (imageName = clientResource.imageName()) != null) {
                HashMap hashMap = a;
                synchronized (hashMap) {
                    String str = "drawable" + imageName;
                    Integer num = (Integer) hashMap.get(str);
                    if (num == null) {
                        intValue = context.getResources().getIdentifier(imageName, "drawable", context.getPackageName());
                        hashMap.put(str, Integer.valueOf(intValue));
                    } else {
                        intValue = num.intValue();
                    }
                }
                return intValue;
            }
        }
        return 0;
    }
}
