package com.google.android.libraries.elements.converters.directupdate;

import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.google.android.libraries.elements.interfaces.DirectUpdateExecutor;
import defpackage.C10223tv0;
import defpackage.EnumC8123no0;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DirectUpdateExecutorImpl extends DirectUpdateExecutor {
    private final DisplayMetrics dm;
    private final Map dynamicPropsMap;
    private Handler handler;

    public DirectUpdateExecutorImpl(Map map, DisplayMetrics displayMetrics) {
        this.dynamicPropsMap = map;
        this.dm = displayMetrics;
    }

    @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
    public void applyChangeStylePropertiesOpacity(float f) {
        C10223tv0 c10223tv0 = (C10223tv0) this.dynamicPropsMap.get(EnumC8123no0.h);
        if (c10223tv0 == null || !(c10223tv0.a instanceof Float)) {
            return;
        }
        setDynamicValue(c10223tv0, Float.valueOf(f));
    }

    @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
    public void applyChangeStylePropertiesBackgroundColor(long j) {
        C10223tv0 c10223tv0 = (C10223tv0) this.dynamicPropsMap.get(EnumC8123no0.g);
        if (c10223tv0 == null || !(c10223tv0.a instanceof Long)) {
            return;
        }
        setDynamicValue(c10223tv0, Long.valueOf(j));
    }

    @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
    public void applyChangeStylePropertiesScale(float f) {
        C10223tv0 c10223tv0 = (C10223tv0) this.dynamicPropsMap.get(EnumC8123no0.k);
        if (c10223tv0 == null || !(c10223tv0.a instanceof Float)) {
            return;
        }
        setDynamicValue(c10223tv0, Float.valueOf(f));
    }

    @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
    public void applyChangeStylePropertiesRotation(float f) {
        C10223tv0 c10223tv0 = (C10223tv0) this.dynamicPropsMap.get(EnumC8123no0.l);
        if (c10223tv0 == null || !(c10223tv0.a instanceof Float)) {
            return;
        }
        setDynamicValue(c10223tv0, Float.valueOf(f));
    }

    @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
    public void applyChangeStylePropertiesTranslation(float f, float f2) {
        C10223tv0 c10223tv0 = (C10223tv0) this.dynamicPropsMap.get(EnumC8123no0.i);
        if (c10223tv0 != null && (c10223tv0.a instanceof Float)) {
            setDynamicValue(c10223tv0, Float.valueOf(TypedValue.applyDimension(1, f, this.dm)));
        }
        C10223tv0 c10223tv02 = (C10223tv0) this.dynamicPropsMap.get(EnumC8123no0.j);
        if (c10223tv02 == null || !(c10223tv02.a instanceof Float)) {
            return;
        }
        setDynamicValue(c10223tv02, Float.valueOf(TypedValue.applyDimension(1, f2, this.dm)));
    }

    private void setDynamicValue(final C10223tv0 c10223tv0, final Object obj) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            if (this.handler == null) {
                this.handler = new Handler(Looper.getMainLooper());
            }
            this.handler.post(new Runnable() { // from class: ko0
                @Override // java.lang.Runnable
                public final void run() {
                    C10223tv0.this.a(obj);
                }
            });
            return;
        }
        c10223tv0.a(obj);
    }
}
