package org.chromium.components.segmentation_platform;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class SegmentationPlatformConversionBridge {
    public static SegmentSelectionResult createSegmentSelectionResult(boolean z, int i) {
        int i2;
        if (i != 999) {
            switch (i) {
                case 0:
                    i2 = 1;
                    break;
                case 1:
                    i2 = 2;
                    break;
                case 2:
                    i2 = 3;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    i2 = 4;
                    break;
                case 4:
                    i2 = 5;
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    i2 = 6;
                    break;
                case 6:
                    i2 = 7;
                    break;
                case 7:
                    i2 = 8;
                    break;
                case 8:
                    i2 = 9;
                    break;
                case 9:
                    i2 = 10;
                    break;
                case 10:
                    i2 = 11;
                    break;
                case 11:
                    i2 = 12;
                    break;
                case 12:
                    i2 = 13;
                    break;
                case 13:
                    i2 = 14;
                    break;
                case 14:
                    i2 = 15;
                    break;
                case 15:
                    i2 = 16;
                    break;
                case 16:
                    i2 = 17;
                    break;
                case 17:
                    i2 = 18;
                    break;
                case 18:
                    i2 = 19;
                    break;
                default:
                    i2 = 0;
                    break;
            }
        } else {
            i2 = 20;
        }
        return new SegmentSelectionResult(z, i2 != 0 ? i2 : 1);
    }

    public static OnDemandSegmentSelectionResult createOnDemandSegmentSelectionResult(SegmentSelectionResult segmentSelectionResult, TriggerContext triggerContext) {
        return new OnDemandSegmentSelectionResult();
    }
}
