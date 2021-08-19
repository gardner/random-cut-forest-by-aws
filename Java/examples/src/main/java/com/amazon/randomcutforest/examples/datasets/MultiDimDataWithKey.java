/*
 * Copyright 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazon.randomcutforest.examples.datasets;

public class MultiDimDataWithKey {
    public double[][] data;
    public int[] changeIndices;
    public double[][] changes;

    public MultiDimDataWithKey(double[][] data, int[] changeIndices, double[][] changes) {
        this.data = data;
        this.changeIndices = changeIndices;
        this.changes = changes;
    }
}