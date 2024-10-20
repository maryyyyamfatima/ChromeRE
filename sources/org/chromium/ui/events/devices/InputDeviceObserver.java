package org.chromium.ui.events.devices;

import J.N;
import android.hardware.input.InputManager;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class InputDeviceObserver implements InputManager.InputDeviceListener {
    public static final InputDeviceObserver c = new InputDeviceObserver();
    public InputManager a;
    public int b;

    public static void addObserver() {
        InputDeviceObserver inputDeviceObserver = c;
        int i = inputDeviceObserver.b;
        inputDeviceObserver.b = i + 1;
        if (i == 0) {
            InputManager inputManager = (InputManager) V60.a.getSystemService("input");
            inputDeviceObserver.a = inputManager;
            inputManager.registerInputDeviceListener(inputDeviceObserver, null);
        }
    }

    public static void removeObserver() {
        InputDeviceObserver inputDeviceObserver = c;
        int i = inputDeviceObserver.b - 1;
        inputDeviceObserver.b = i;
        if (i == 0) {
            inputDeviceObserver.a.unregisterInputDeviceListener(inputDeviceObserver);
            inputDeviceObserver.a = null;
        }
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceAdded(int i) {
        N.MGCvz8lp(this);
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceChanged(int i) {
        N.MGCvz8lp(this);
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceRemoved(int i) {
        N.MGCvz8lp(this);
    }
}
