package org.chromium.components.media_router.caf;

import android.content.Context;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import defpackage.AbstractC9095qe2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class CastOptionsProvider {
    public List getAdditionalSessionProviders(Context context) {
        return null;
    }

    public CastOptions getCastOptions(Context context) {
        ArrayList arrayList = new ArrayList();
        new LaunchOptions();
        ArrayList arrayList2 = new ArrayList();
        AbstractC9095qe2 a = AbstractC9095qe2.a(null);
        LaunchOptions launchOptions = new LaunchOptions();
        launchOptions.a = true;
        return new CastOptions(null, arrayList, true, launchOptions, false, (CastMediaOptions) a.e(), false, 0.05000000074505806d, false, false, false, arrayList2, true);
    }
}
