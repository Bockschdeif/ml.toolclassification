package de.uni_koeln.spinfo.ml.toolclassification.components.preprocessing;

import java.util.Map;

import de.uni_koeln.spinfo.ml.toolclassification.data.Tool;

public class BOWContainer {
	
	private Map<Tool, double[]> toolsVector;
	
	private int vectorsDim;
	
	public BOWContainer(Map<Tool, double[]> vector, int dim) {
		toolsVector = vector;
		vectorsDim = dim;
	}

	public Map<Tool, double[]> getToolsVector() {
		return toolsVector;
	}

	public void setToolsVector(Map<Tool, double[]> toolsVector) {
		this.toolsVector = toolsVector;
	}

	public int getVectorsDim() {
		return vectorsDim;
	}

	public void setVectorsDim(int vectorsDim) {
		this.vectorsDim = vectorsDim;
	}
}
