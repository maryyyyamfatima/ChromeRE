package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oZ1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8379oZ1 {
    public final MotionEvent.PointerProperties[] a = new MotionEvent.PointerProperties[16];
    public final MotionEvent.PointerCoords[] b = new MotionEvent.PointerCoords[16];
    public final View c;
    public long d;

    public C8379oZ1(View view) {
        this.c = view;
    }

    public final void b(int i, float f, float f2, int i2, int i3) {
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.x = f;
        pointerCoords.y = f2;
        pointerCoords.pressure = 1.0f;
        this.b[i] = pointerCoords;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = i2;
        pointerProperties.toolType = i3;
        this.a[i] = pointerProperties;
    }

    public final void a(int i, int i2, long j) {
        View view = this.c;
        switch (i) {
            case 0:
                this.d = j;
                MotionEvent obtain = MotionEvent.obtain(j, j, 0, 1, this.a, this.b, 0, 0, 1.0f, 1.0f, 0, 0, 0, 0);
                view.dispatchTouchEvent(obtain);
                obtain.recycle();
                if (i2 > 1) {
                    MotionEvent obtain2 = MotionEvent.obtain(this.d, j, 261, i2, this.a, this.b, 0, 0, 1.0f, 1.0f, 0, 0, 0, 0);
                    view.dispatchTouchEvent(obtain2);
                    obtain2.recycle();
                    return;
                }
                return;
            case 1:
                MotionEvent obtain3 = MotionEvent.obtain(this.d, j, 2, i2, this.a, this.b, 0, 0, 1.0f, 1.0f, 0, 0, 0, 0);
                view.dispatchTouchEvent(obtain3);
                obtain3.recycle();
                return;
            case 2:
                MotionEvent obtain4 = MotionEvent.obtain(this.d, j, 3, 1, this.a, this.b, 0, 0, 1.0f, 1.0f, 0, 0, 0, 0);
                view.dispatchTouchEvent(obtain4);
                obtain4.recycle();
                return;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                if (i2 > 1) {
                    MotionEvent obtain5 = MotionEvent.obtain(this.d, j, 262, i2, this.a, this.b, 0, 0, 1.0f, 1.0f, 0, 0, 0, 0);
                    view = view;
                    view.dispatchTouchEvent(obtain5);
                    obtain5.recycle();
                }
                MotionEvent obtain6 = MotionEvent.obtain(this.d, j, 1, 1, this.a, this.b, 0, 0, 1.0f, 1.0f, 0, 0, 0, 0);
                view.dispatchTouchEvent(obtain6);
                obtain6.recycle();
                return;
            case 4:
                MotionEvent obtain7 = MotionEvent.obtain(this.d, j, 8, i2, this.a, this.b, 0, 0, 1.0f, 1.0f, 0, 0, 2, 0);
                view.dispatchGenericMotionEvent(obtain7);
                obtain7.recycle();
                return;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
            case 6:
            case 7:
                MotionEvent obtain8 = MotionEvent.obtain(this.d, j, 7 == i ? 7 : 6 == i ? 10 : 9, i2, this.a, this.b, 0, 0, 1.0f, 1.0f, 0, 0, 2, 0);
                view.dispatchGenericMotionEvent(obtain8);
                obtain8.recycle();
                return;
            default:
                return;
        }
    }
}
